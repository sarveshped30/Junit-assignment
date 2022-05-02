package com.bridgelabs.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class User {
    static Logger logger = Logger.getLogger(User.class);
    private String firstName;
    private String lastName;
    private String emailId;
    private String number;
    private String password;

    /* Creating object for validator class */
    static Validator validate = new Validator();

    /* Creating Getters and Setters */

    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) {
        // Checking if user input matches the pattern
        if(validate.validateFirstName(firstName)) {
            this.firstName = firstName;     // Assigning value to firstName
            return true;
        } else {
            return false;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // Checking if user input matches the pattern
        if(validate.validateLastName(lastName)) {
            this.lastName = lastName;       // Assigning value to lastName
            System.out.println("Valid");
        } else {
            System.out.println("Invalid pattern for Last name");
        }
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        if(validate.validateEmail(emailId)) {
            this.emailId = emailId;
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(validate.validateNumber(number)) {
            this.number = number;
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(validate.validatePassword(password)) {
            this.password = password;
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        User user =  new User();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        user.setFirstName(sc.next());

        System.out.println("Enter last name : ");
        user.setLastName(sc.next());

        System.out.println("Enter emailId: ");
        user.setEmailId(sc.nextLine());

        System.out.println("Enter Number: ");
        user.setNumber(sc.nextLine());

        System.out.println("Enter password: ");
        user.setPassword(sc.nextLine());
    }
}
