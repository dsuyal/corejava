package com.rays.cloning;

public class Account implements Cloneable {
	
	Object o = 100;
	int balance = 0;
	
	public Account() {
		
	}
	public Account(int balance) {
		this.balance = balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	
	}
	

}
