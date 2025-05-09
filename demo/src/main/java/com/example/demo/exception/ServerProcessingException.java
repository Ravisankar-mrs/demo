package com.example.demo.exception;

public class ServerProcessingException  extends RuntimeException {
	
	private static final long serialVersionUID = -3126607376875084453L;

    public ServerProcessingException(String message) {
        super(message);
    }


}
