package com.texas.ecs.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        List<FieldError> fieldErrors = ex.getFieldErrors();
        Map<String,String> errorMap=new HashMap<>();
        fieldErrors.stream().forEach(fieldError -> {
            errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return new ResponseEntity<>(errorMap,status);
    }

    @ExceptionHandler({ResourceNotFoundException.class})
    protected ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(
                Map.of("message",ex.getMessage())
                , HttpStatus.NOT_FOUND);
    }
}
