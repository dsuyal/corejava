package com.rays.exception;

public class TestExceptionPropagation {
public static void main(String[] args)throws MistakeException {	
	
		dad();
	
}

	public static void dad()throws MistakeException {
		
		mom();
	
	
}
	public static void mom()throws MistakeException{
		son();
	}
	public static void son()throws MistakeException{
		MistakeException e = new MistakeException();
		
		throw e;
	}
}


