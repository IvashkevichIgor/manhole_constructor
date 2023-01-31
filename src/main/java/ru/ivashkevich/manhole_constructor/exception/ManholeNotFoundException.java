package ru.ivashkevich.manhole_constructor.exception;

public class ManholeNotFoundException extends RuntimeException{
    public ManholeNotFoundException(String message) {
        super(message);
    }

    public ManholeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
