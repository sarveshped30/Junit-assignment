/* Junit assignment for testing cases
 * RFP assignment
 * Author: sarvesh pednekar */

package com.bridgelabs.test;

public class User {

    /* Creating object for validator class */
    static Validator validate = new Validator();

    /* Creating checking methods which validates user input with pattern and returns true or false */

    public boolean checkFirstName(String firstName) {
        // Checking if user input matches the pattern
        boolean result = validate.validateFirstName(firstName);
        return result;
    }

    public boolean checkLastName(String lastName) {
        // Checking if user input matches the pattern
        boolean result = validate.validateLastName(lastName);
        return result;
    }

    public boolean checkEmailId(String emailId) {
        boolean result = validate.validateEmail(emailId);
        return result;
    }

    public boolean checkNumber(String number) {
        boolean result = validate.validateNumber(number);
        return result;
    }

    public boolean checkPassword(String password) {
        boolean result = validate.validatePassword(password);
        return result;
    }
}
