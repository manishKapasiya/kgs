package com.manish.tinyurl.kgs.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class GetKeyException extends RuntimeException{

    private String errorCode;
    private String errorMessage;
    private HttpStatus httpStatus;

}
