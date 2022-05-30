package com.robbo.cursomc.resources.exception;

import com.robbo.cursomc.resources.exception.StandardError;
import com.robbo.cursomc.service.exceptions.ObjectiveNotFoundeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectiveNotFoundeException.class)
    public ResponseEntity<StandardError> objectNotFounde(ObjectiveNotFoundeException e, HttpServletRequest req){

        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(),e.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}
