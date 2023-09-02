package com.rays.java8;

public interface DefaultStaticInterface {
	
	public void abstractmethod();
	
	public default void defaultMethod() {
		System.out.println("default Method....!!!");
	}
	
	public static void staticMethod() {
		System.out.println("static method...!!!");
	}

}
