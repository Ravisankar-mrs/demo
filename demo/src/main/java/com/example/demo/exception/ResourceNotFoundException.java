package com.example.demo.exception;

public class ResourceNotFoundException  extends RuntimeException {
	
	   private static final long serialVersionUID = 1153829273251174157L;

	    public ResourceNotFoundException(String message) {
	        super(message);
	    }

}
