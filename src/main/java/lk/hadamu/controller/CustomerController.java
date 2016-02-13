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

package lk.hadamu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller class for customer.
 * <p>
 * Basically this is the JAX-RS for the application to create, edit and delete a customer.
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    /**
     * REST method for add a new customer
     *
     * @param username
     * @param jsonData
     */

    @RequestMapping(value = "/register/{username}/{data}", method = RequestMethod.PUT)
    public boolean register(@PathVariable(value = "username") String username,
                            @PathVariable(value = "data") String jsonData) {
        return false;
    }

    @RequestMapping(value = "/edit/{username}/{data}", method = RequestMethod.PUT)
    public boolean editCustomer(@PathVariable(value = "username") String username,
                                @PathVariable(value = "data") String jsonData) {
        return false;
    }

    @RequestMapping(value = "/delete/{username}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable(value = "username") String username) {
        return false;
    }

    @RequestMapping(value = "/view/{username}", method = RequestMethod.GET)
    public boolean viewCustomer(@PathVariable(value = "username") String username) {
        return false;
    }

}
