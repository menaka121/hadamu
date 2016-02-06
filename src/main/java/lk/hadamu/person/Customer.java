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

package lk.hadamu.person;

import org.springframework.data.annotation.Id;

/**
 * Created by menaka on 2/7/16.
 *
 * The customer is the person who creates an account in the site, add information and manages the content.
 * Can be :- an engineer, business owner, job seeker etc.
 *
 */
public class Customer {

    /**
     * A customer usually has an id
     * */
    @Id
    private String id;

    /**
     * then first name, last name and middle name
     * */
    private String firstName;
    private String middleName;
    private String lastName;

    /**
     * A customer should have an address, telephone number and an e-mail address.
     * */

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String district;
    private String telephoneNumber;
    private String emailAddress;

    /**
     * A customer should have a unique username and password for login.
     * */

    private String userName;
    private String password;

}
