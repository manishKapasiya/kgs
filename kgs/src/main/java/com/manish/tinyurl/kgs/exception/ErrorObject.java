package com.manish.tinyurl.kgs.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorObject {
    private String errorCode;
    private String errorMessage;
}
