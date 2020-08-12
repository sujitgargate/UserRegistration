package com.userregistration;

public class UserRegistration {

    public static void main(String[] args) {
    }

    //This method is for checking Valid first name
    public boolean checkFirstName(String firstName) {

        return(firstName.matches("[A-Z][a-z]{3,}"));
    }

    //This method is for checking Valid last name
    public boolean checkLastName(String lastName) {

        return(lastName.matches("[A-Z][a-z]{3,}"));
    }

    //This method is for checking Valid Email Address
    public boolean checkUserEmail(String userEmail) {

        String pattern = "^[a-zA-Z]+([._+-][a-zA-Z]+)*[@][A-Za-z]+[.][a-zA-Z]+([.][a-zA-Z]{2})*$";
        return (userEmail.matches(pattern));
    }

    //This method is for checking Valid Phone Number
    public boolean checkUserPhoneNumber(String userPhoneNumber) {

        String pattern = "^[0-9]{1,2}[ ][0-9]{10}$";
        return (userPhoneNumber.matches(pattern));
    }

    //This method is for checking Valid Password
    public boolean checkUserPassword(String userPassword) {

        String pattern = "^(?=.*[A-Z])(?=.*[a-z]).{8,}$";
        return (userPassword.matches(pattern));
    }
}
