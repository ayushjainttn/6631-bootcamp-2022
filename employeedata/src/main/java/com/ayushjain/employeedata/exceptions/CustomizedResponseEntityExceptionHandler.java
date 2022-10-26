package com.ayushjain.employeedata.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<CustomizedErrorFormat> handleException(Exception ex) throws Exception{
        CustomizedErrorFormat errorFormat = new CustomizedErrorFormat(LocalDateTime.now(), ex.getMessage());
        return new ResponseEntity<>(errorFormat, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public final ResponseEntity<CustomizedErrorFormat> handleNotFoundException(Exception ex) throws EmployeeNotFoundException{
        CustomizedErrorFormat errorFormat = new CustomizedErrorFormat(LocalDateTime.now(), ex.getMessage());
        return new ResponseEntity<>(errorFormat, HttpStatus.NOT_FOUND);
    }
}
