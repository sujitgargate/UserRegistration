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
}
