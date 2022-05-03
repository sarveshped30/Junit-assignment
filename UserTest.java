package com.bridgelabs.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/* Creating test methods for testing code
 * Happy Test method for success case
 * Sad Test method for failure case
 * Parameterized test for more than one parameter's input */

public class UserTest {
    User user = new User();

    @Test
    public void firstNameHappyTest() {
        boolean firstName = user.checkFirstName("Sarvesh");
        Assert.assertTrue(firstName);
    }

    @Test
    public void firstNameSadTest() {
        boolean firstName = user.checkFirstName("sarvesh");
        Assert.assertFalse(firstName);
    }

    @Test
    public void lastNameHappyTest() {
        boolean lastName = user.checkLastName("Pednekar");
        Assert.assertTrue(lastName);
    }

    @Test
    public void lastNameSadTest() {
        boolean lastName = user.checkLastName("pednekar");
        Assert.assertFalse(lastName);
    }

    @Test
    public void emailIdHappyTest() {
        boolean emailId = user.checkEmailId("sarvesh.pednekar30@gmail.com.co");
        Assert.assertTrue(emailId);
    }

    @Test
    public void emailIdSadTest() {
        boolean emailId = user.checkEmailId("sarvesh@pednekar30@gmail.com.co");
        Assert.assertFalse(emailId);
    }

    @Test
    public void numberHappyTest() {
        boolean number = user.checkNumber("91 7977293433");
        Assert.assertTrue(number);
    }

    @Test
    public void numberSadTest() {
        boolean number = user.checkNumber("917977293433");
        Assert.assertFalse(number);
    }

    @Test
    public void passwordHappyTest() {
        boolean password = user.checkPassword("lunaticAsylum@30");
        Assert.assertTrue(password);
    }

    @Test
    public void passwordSadTest() {
        boolean password = user.checkPassword("lunaticasylum@30");
        Assert.assertFalse(password);
    }

    @ParameterizedTest
    @ValueSource(strings = {"sarvesh.pednekar30@gmail.com.co", "abc.xyz100@yahoo.com.in"})
    public void isTrue(String input) {
        boolean email = user.checkEmailId(input);
        Assert.assertTrue(email);
    }

    @ParameterizedTest
    @ValueSource(strings = {"sarvesh..Pednekar30@gmail.com.co", "abc-xyz100@yahoo.c"})
    public void isFalse(String input) {
        boolean email = user.checkEmailId(input);
        Assert.assertFalse(email);
    }
}
