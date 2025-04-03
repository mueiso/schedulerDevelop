package com.myproject.schedulerdevelop.exception;

import com.myproject.schedulerdevelop.dto.UserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity handleIllegalArgumentException (IllegalArgumentException illegalArgumentException) {


        String message = illegalArgumentException.getMessage();
        return ResponseEntity.badRequest().body(illegalArgumentException.getMessage());
    }




}
