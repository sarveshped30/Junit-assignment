package com.bridgelabs.test;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    User user = new User();

    @Test
    public void firstNameTest() {
        boolean firstName = user.setFirstName("Sarvesh");
        Assert.assertTrue(firstName);
    }

}
