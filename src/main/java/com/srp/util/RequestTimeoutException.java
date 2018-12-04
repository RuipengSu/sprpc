package com.srp.util;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/20
 */
public class RequestTimeoutException extends RuntimeException {

    public RequestTimeoutException(String message) {
        super(message);
    }

    public RequestTimeoutException(Throwable cause) {
        super(cause);
    }
}
