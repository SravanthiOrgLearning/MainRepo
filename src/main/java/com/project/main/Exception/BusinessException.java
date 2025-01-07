package com.project.main.Exception;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorName;
	
	
	public BusinessException(String errorCode, String errorName) {
		super();
		this.errorCode = errorCode;
		this.errorName = errorName;
	}
	public BusinessException() {
		super();
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorName() {
		return errorName;
	}
	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}
	
	
}