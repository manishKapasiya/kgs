package com.manish.tinyurl.kgs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GetKeyException.class)
    public ResponseEntity<Object> exception(GetKeyException  exception) {
        ErrorObject object = new ErrorObject(exception.getErrorCode(),exception.getErrorMessage());
        return new ResponseEntity(object, exception.getHttpStatus());
    }

}
