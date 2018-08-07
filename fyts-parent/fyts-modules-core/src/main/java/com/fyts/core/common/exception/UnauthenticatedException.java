package com.fyts.core.common.exception;

public class UnauthenticatedException extends FytsApiException {

    private static final long serialVersionUID = -2426047378183144581L;

    public UnauthenticatedException() {
        super("Unauthorized");
    }

    public UnauthenticatedException(String message) {
        super(message);
    }

    public UnauthenticatedException(Throwable cause) {
        super(cause);
    }

    public UnauthenticatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnauthenticatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
