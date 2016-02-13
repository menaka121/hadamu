package lk.hadamu.dao;

import lk.hadamu.core.Customer;
import lk.hadamu.dto.CustomerDTO;

/**
 */
public interface CustomerServiceDAO {

    CustomerDTO create(CustomerDTO customerDTO);

    Customer findByUserName(String username);

    CustomerDTO update(CustomerDTO customerDTO);

    boolean delete(String username);

}
