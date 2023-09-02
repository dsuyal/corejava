package com.rays.oopconstructore;


public class Account {

    private String number;
    private String accounttype;
    private double balance;
    
    public Account() {

    }

    public Account(String number,String accounttype,double balance) {
        this.number = number;
        this.accounttype = accounttype ;
        this.balance = balance;
    }
    public void setname(String number) {
        this.number = number;
    }

    public String getnumber() {
        return number;
    }

    public void setaccounttype(String accounttype) {
        this.accounttype = accounttype;
    }
    public String getaccounttype() {
        return accounttype;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public double getbalance() {
        return balance;
    }

}
