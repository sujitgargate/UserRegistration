package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class UserRegistrationTest {

    Scanner sc = new Scanner(System.in);
    UserRegistration userregistration = new UserRegistration();

    //This case is for checking Valid first name
    @Test
    public void enteredFirstName_Should_Return_True() {

        String firstName = "Sujit";
        Assert.assertTrue("InValid FirstName", userregistration.checkFirstName(firstName));
    }

    //This case is for checking Valid last name
    @Test
    public void enteredLastName_Should_Return_True() {

        String lastName = "Gargate";
        Assert.assertTrue("InValid LastName", userregistration.checkLastName(lastName));
    }

    //This case is for checking Valid Email
    @Test
    public void enteredEmail_should_Return_true() {

        String userEmail = "sujit@gmail.co.in";
        Assert.assertTrue("Invalid Email", userregistration.checkUserEmail(userEmail));
    }

    //This case is for checking Phone Number
    @Test
    public void enteredPhoneNumber_should_Return_true() {

        String userPhoneNumber = "11 1234567890";
        Assert.assertTrue("Invalid Phone Number", userregistration.checkUserPhoneNumber(userPhoneNumber));
    }
}
