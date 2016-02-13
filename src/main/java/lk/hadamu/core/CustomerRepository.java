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

package lk.hadamu.core;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Interface defined in Spring boot to access data base.
 * <p>
 * use mongo db as the data base
 * <p>
 * A customer can be found by several ways.
 * Define find queries.
 * <p>
 * 1. first name
 * 2. last name
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    /**
     * /**
     * Find by first name:
     * There can be multiple customers with the same first name.
     * <p>
     * find by last name is also the same
     */
    public List<Customer> findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

}
