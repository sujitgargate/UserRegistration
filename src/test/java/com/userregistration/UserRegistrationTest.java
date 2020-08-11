package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void enteredFirstName_Should_Return_True() {

        UserRegistration userregistration = new UserRegistration();

        boolean nameValidation = userregistration.checkFirstName();
        Assert.assertSame("True",nameValidation);
    }
}
