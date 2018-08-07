package com.fyts.core.common.exception;

public class FytsApiException extends RuntimeException {

	private static final long serialVersionUID = -5974746464216324079L;

	public FytsApiException() {
		super();
	}

	public FytsApiException(String message) {
		super(message);
	}

	public FytsApiException(Throwable cause) {
		super(cause);
	}

	public FytsApiException(String message, Throwable cause) {
		super(message, cause);
	}

	public FytsApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
