package com.example.restApi.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String message) {

        super(message);
    }
}
