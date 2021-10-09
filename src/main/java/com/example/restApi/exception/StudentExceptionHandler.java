package com.example.restApi.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class StudentExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public final ResponseEntity<ErrorMessage> studentNotFound(StudentNotFoundException ex){
        ErrorMessage err = new ErrorMessage(ex.getMessage(), 404, "google.com");
        return new ResponseEntity(err, HttpStatus.BAD_REQUEST);
    }
}
