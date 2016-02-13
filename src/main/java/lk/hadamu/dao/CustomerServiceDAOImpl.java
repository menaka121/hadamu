package lk.hadamu.dao;

import lk.hadamu.core.Customer;
import lk.hadamu.core.CustomerRepository;
import lk.hadamu.dto.CustomerDTO;
import lk.hadamu.exceptions.CustomerNotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 */

@Service
public class CustomerServiceDAOImpl implements CustomerServiceDAO {

    private final CustomerRepository customerRepository;
    private Log log = LogFactory.getLog(CustomerServiceDAOImpl.class);

    @Autowired
    public CustomerServiceDAOImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDTO create(CustomerDTO customerDTO) {
        Customer customerCreated = new Customer();
        customerCreated.setUserName(customerDTO.getUserName());
        customerCreated.setPassword(customerDTO.getPassword());
        return null;
    }

    @Override
    public Customer findByUserName(String username) throws CustomerNotFoundException {
        Customer exists = customerRepository.findOne(username);

        if (exists != null) {
            return exists;
        } else {
            throw new CustomerNotFoundException(username);
        }
    }

    @Override
    public CustomerDTO update(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public boolean delete(String username) throws CustomerNotFoundException {
        Customer toDelete = customerRepository.findOne(username);
        if (toDelete != null) {
            customerRepository.delete(toDelete);
            return true;
        } else {
            throw new CustomerNotFoundException(username);
        }
    }
}
