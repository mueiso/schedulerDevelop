package com.myproject.schedulerdevelop.handler;

public class ControllerExceptionHandler extends RuntimeException {
    public ControllerExceptionHandler(String message) {
        super(message);
    }
}
