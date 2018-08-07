package com.fyts.core.common.exception;

public class ResourceNotFoundException extends FytsApiException {

	private static final long serialVersionUID = 5666381508272695033L;

	public ResourceNotFoundException() {
		super("Not Found");
	}

	public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);
	}

}
