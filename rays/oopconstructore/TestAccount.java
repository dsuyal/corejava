package com.rays.oopconstructore;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account("Account no. 123456789", "Account type saving", 50000.50);
        
        System.out.println(a.getnumber());
        System.out.println(a.getaccounttype());
        System.out.println(a.getbalance());
    }

}
	
