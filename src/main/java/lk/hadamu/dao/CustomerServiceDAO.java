package lk.hadamu.dao;

import lk.hadamu.core.Customer;
import lk.hadamu.dto.CustomerDTO;
import lk.hadamu.exceptions.CustomerCouldNotCreateException;
import lk.hadamu.exceptions.CustomerNotFoundException;

/**
 */
public interface CustomerServiceDAO {

    CustomerDTO create(CustomerDTO customerDTO) throws CustomerCouldNotCreateException;

    Customer findByUserName(String username) throws CustomerNotFoundException;

    CustomerDTO update(CustomerDTO customerDTO) throws CustomerNotFoundException;

    boolean delete(String username) throws CustomerNotFoundException;

}
