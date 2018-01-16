package com.kys.stucture.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by esha on 06/12/17.
 */

@RestControllerAdvice
public class KYSExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(KYSException.class)
    public final ResponseEntity<Object> handleKysException(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(ex, HttpStatus.BAD_REQUEST);
    }
}
