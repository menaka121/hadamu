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

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The customer is the person who creates an account in the site, add information and manages the content.
 * Can be :- an engineer, business owner, job seeker etc.
 */
@Document
public class Customer {

    /**
     * A customer usually has an id
     */
    @Id
    private String id;

    /**
     * then first name, last name and middle name
     */
    private String firstName;
    private String middleName;
    private String lastName;

    /**
     * A customer should have an address, telephone number and an e-mail address.
     */

    private Address address;

    /**
     * A customer should have a unique username and password for login.
     */

    private String userName;
    private String password;

    private String emailAddress;

    /**
     * Constructor
     */

    public Customer(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return this.firstName + this.middleName + this.lastName;
    }
}
