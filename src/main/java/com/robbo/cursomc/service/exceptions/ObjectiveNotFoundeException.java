package com.robbo.cursomc.service.exceptions;

public class ObjectiveNotFoundeException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ObjectiveNotFoundeException(String msg){
        super(msg);
    }
    public ObjectiveNotFoundeException(String msg, Throwable cause){
        super(msg, cause);
    }
}
