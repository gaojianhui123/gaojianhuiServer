package com.sanyi.framework.exception;

public class BusinessException extends Exception{

	/**
	 * 
	 */
	private boolean isBussiness= true;
	private static final long serialVersionUID = 665439655490513764L;
	public BusinessException(String string) {
		super(string);
		this.isBussiness = true;
	}
	public boolean isBussiness() {
		return isBussiness;
	}
	public void setBussiness(boolean isBussiness) {
		this.isBussiness = isBussiness;
	}
	
}
