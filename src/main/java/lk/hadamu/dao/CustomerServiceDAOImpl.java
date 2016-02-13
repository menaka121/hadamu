package lk.hadamu.dao;

import lk.hadamu.core.Customer;
import lk.hadamu.core.CustomerRepository;
import lk.hadamu.dto.CustomerDTO;
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
    public Customer findByUserName(String username) {
        Customer found;
        try {
            found = customerRepository.findOne(username);
            return found;
        } catch (Exception e) {
            log.error("No User found " + e);
            return null;
        }
    }

    @Override
    public CustomerDTO update(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public boolean delete(String username) {

        return false;
    }
}
