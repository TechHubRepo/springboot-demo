package com.techhub.springbootdemo.exception;

public class DemoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DemoException(String message){
		super(message);
	}
		
	public DemoException(String message, Throwable throwable){
		super(message,throwable);
	}
}
