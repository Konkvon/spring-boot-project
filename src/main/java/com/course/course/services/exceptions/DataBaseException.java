package com.course.course.services.exceptions;

public class DataBaseException extends RuntimeException {
    public DataBaseException() {
        super("Database error");
    }
}
