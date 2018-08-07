package com.fyts.core.common.exception;

public class SolrException extends FytsApiException {

	private static final long serialVersionUID = -2521042993532140943L;

	public SolrException(String msg) {
		super(msg);
	}

	public SolrException() {
		super("Solr Option Fail");
	}

	public SolrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SolrException(String message, Throwable cause) {
		super(message, cause);
	}

	public SolrException(Throwable cause) {
		super(cause);
	}

}
