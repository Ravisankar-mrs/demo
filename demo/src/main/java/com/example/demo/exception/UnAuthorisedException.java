package com.example.demo.exception;

public class UnAuthorisedException extends RuntimeException{
	
    private static final long serialVersionUID = -7953309547278694465L;

    public UnAuthorisedException(String message) {
        super(message);
    }

    public UnAuthorisedException(String message, Throwable cause) {
        super(message, cause);
    }

}
