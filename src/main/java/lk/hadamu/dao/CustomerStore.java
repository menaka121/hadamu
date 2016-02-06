/*
Copyright 2016 team hadamu.lk

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package lk.hadamu.dao;

import lk.hadamu.person.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by menaka on 2/7/16.
 *
 * Interface defined in Spring boot to access data base.
 *
 * use mongo db as the data base
 */
public interface CustomerStore extends MongoRepository < Customer, String > {

    /**
     * define find queries.
     *
     * A customer can be found by several ways.
     *  1. user name
     *  2. first name
     *  3. last name
     *  4. address
     * */

    /**
     * Find by user name:
     *      Basically user name is unique. So there could be only one customer
     * */
    public Customer findByUserName (String userName);

    /**
     * Find by first name:
     *      There can be multiple customers with the same first name.
     *
     *      find by last name is also the same
     * */
    public List<Customer> findByFirstName (String firstName);
    public List<Customer> findByLastName (String lastName);

    /**
     * Find by address:
     *
     *      There can be multiple customers with the same address.
     *      Eg: Working in the same company.
     * */
    public List<Customer> findByAddress (String line1, String line2, String line3);

}
