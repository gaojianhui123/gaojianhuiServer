package com.gaojianhui.framework.model;


public class ResultEntity {
    private boolean success = true;
    private String message;
    private String code;
//    private T entity;
    
    
    public ResultEntity(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
//		this.entity = entity;
	}


    public static  ResultEntity fail(String message) {
        return new ResultEntity(false, message);
    }


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
    

}
