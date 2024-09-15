package com.example.Splitwise.Exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super("User not found");
    }
}
