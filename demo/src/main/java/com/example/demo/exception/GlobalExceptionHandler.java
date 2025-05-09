package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler extends Exception {
    private static final long serialVersionUID = -3797068453487579095L;

    @ExceptionHandler(value = BadRequestException.class)
    public ResponseEntity<String> handleBadRequestException(BadRequestException exp) {
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = UnAuthorisedException.class)
    public ResponseEntity<String> handleUnAuthorisedException(UnAuthorisedException exp) {
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = AccessForbiddenException.class)
    public ResponseEntity<String> handleAccessForbiddenException(AccessForbiddenException exp) {
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException exp) {
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = ServerProcessingException.class)
    public ResponseEntity<String> handleServerProcessingException(ServerProcessingException exp) {
        return new ResponseEntity<>(exp.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
