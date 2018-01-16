package com.kys.stucture.exception;


public class KYSException extends RuntimeException {

    public KYSException(String errorMessagge) {
        super(errorMessagge);
    }

    public KYSException(String errorMessage, Exception e) {
        super(errorMessage, e);
    }
}
