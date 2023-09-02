package com.rays.oop;

public class Account {

	private int balance = 0;
	
	public void setbalance(int balance) {
		this.balance = balance;
		
	}
	public int getbalance() {
		return balance;
		
	}
	public void deposite(int amt) {
		int total = getbalance() +  amt;
		
		setbalance(total);
		System.out.println("balance after deposite "+getbalance());
	}
	public void withdraw(int amt) {
		int total = getbalance() - amt;
		
		if (total<2000) {
			System.out.println("insuficiante balance...!!!!");
			
		} else {
			setbalance(total);
			System.out.println("balance after withrawal " +getbalance());

		}
	}
	
}


