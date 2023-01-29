package ru.ivashkevich.well_constructor.exception;

public class WellNotFoundException extends RuntimeException{
    public WellNotFoundException(String message) {
        super(message);
    }

    public WellNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
