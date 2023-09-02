package com.rays.oopconstructore;

import java.util.Date;

public class Person {

    private String name;
    private Date dob;
    private String address;
 
    public Person() {

    }

    public Person(String name, Date dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setdob(Date dob) {
        this.dob = dob;
        
    }

    public Date getdob() {
        return dob;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }
}
