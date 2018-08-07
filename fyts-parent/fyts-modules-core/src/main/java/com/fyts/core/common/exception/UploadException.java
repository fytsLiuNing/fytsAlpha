package com.fyts.core.common.exception;

public class UploadException extends FytsApiException {

	private static final long serialVersionUID = -2521042993532140943L;

	public UploadException(String msg) {
		super(msg);
	}

	public UploadException() {
		super("Upload Fail");
	}

	public UploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UploadException(String message, Throwable cause) {
		super(message, cause);
	}

	public UploadException(Throwable cause) {
		super(cause);
	}

}
