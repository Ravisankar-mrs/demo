package com.example.demo.exception;

public class BadRequestException extends RuntimeException{
	  private static final long serialVersionUID = -7953309547278694465L;

	    public BadRequestException(String message) {
	        super(message);
	    }

}
