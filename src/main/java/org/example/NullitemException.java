package org.example;

public class NullitemException extends RuntimeException{
    public NullitemException() {
    }

    public NullitemException(String message) {
        super(message);
    }

    public NullitemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullitemException(Throwable cause) {
        super(cause);
    }

    public NullitemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
