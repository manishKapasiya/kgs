package com.manish.tinyurl.kgs.constants;

import org.springframework.http.HttpStatus;

public class Error {

    public static final String GET_KEY_EXCEPTION_ERROR_MESSAGE = "Exception while fetching keys";
    public static final String GET_KEY_EXCEPTION_ERROR_CODE = "1001";
    public static final HttpStatus GET_KEY_EXCEPTION_ERROR_HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

}
