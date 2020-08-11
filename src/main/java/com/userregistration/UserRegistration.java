package com.userregistration;

public class UserRegistration {

    public static void main(String[] args) {
    }

    //This method is for checking Valid first name
    public boolean checkFirstName(String firstName) {

        return(firstName.matches("[A-Z][a-z]{3,}"));
    }

    //This method is for checking Valid first name
    public boolean checkLastName(String lastName) {

        return(lastName.matches("[A-Z][a-z]{3,}"));
    }

    //
    public boolean checkUserEmail(String userEmail) {

        String pattern = "^[a-zA-Z]+([._+-][a-zA-Z]+)*[@][A-Za-z]+[.][a-zA-Z]+([.][a-zA-Z]{2})*$";
        return (userEmail.matches(pattern));
    }

    public boolean checkUserPhoneNumber(String userPhoneNumber) {
        String pattern = "^[0-9]{1,2}[ ][0-9]{10}$";
        return (userPhoneNumber.matches(pattern));
    }
}
