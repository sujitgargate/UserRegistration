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

        String pattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})*$";
        return (userEmail.matches(pattern));
    }

    //This method is for checking Valid Phone Number
    public boolean checkUserPhoneNumber(String userPhoneNumber) {

        String pattern = "^[0-9]{1,2}[ ][0-9]{10}$";
        return (userPhoneNumber.matches(pattern));
    }

    //This method is for checking Valid Password
    public boolean checkUserPassword(String userPassword) {

        String pattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:'<>,.?/~`_+-=|].).{8,}$";
        return (userPassword.matches(pattern));
    }
}
