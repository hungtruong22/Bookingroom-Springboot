package com.Booking.Booking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomUrlNotFoundException extends ControllerBase {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> handleException(NoHandlerFoundException ex, WebRequest request) {
        Map<String, Object> body = new HashMap<>();

        body.put("errorCode", 404);
        body.put("exception", ex.getMessage());
        body.put("url", request.getDescription(false).replace("uri=", ""));

        return notFound(body);
    }
}
