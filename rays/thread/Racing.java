package com.rays.thread;

public class Racing extends Thread{
	
	String name  = null;
	
	static Account account = new Account();
	
	public Racing(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			
	Racing.account.deposite(name, 1000);
			
		}
	}

}
