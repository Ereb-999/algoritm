package org.example;

public class StorgeIsFullException extends RuntimeException {
    public StorgeIsFullException() {
    }

    public StorgeIsFullException(String message) {
        super(message);
    }

    public StorgeIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorgeIsFullException(Throwable cause) {
        super(cause);
    }

    public StorgeIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
