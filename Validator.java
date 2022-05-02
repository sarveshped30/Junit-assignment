package com.bridgelabs.test;

import java.util.regex.Pattern;

public class Validator {
    /* Creating and initializing pattern for user details */
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String EMAIL_PATTERN = "^[a-z0-9+.]+@[a-z+.]+$";
    private static final String NUMBER_PATTERN = "^[0-9]{2}[\\s][0-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";;

    /* Validating first name with pattern */
    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_PATTERN, firstName);
    }

    /* Validating last name with pattern*/
    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME_PATTERN, lastName);
    }

    /* Validating email with pattern */
    public boolean validateEmail(String emailId) {
        return Pattern.matches(EMAIL_PATTERN, emailId);
    }

    /* Validating number with pattern */
    public boolean validateNumber(String number) {
        return Pattern.matches(NUMBER_PATTERN,number);
    }

    /* Validating password with pattern */
    public boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_PATTERN,password);
    }
}
