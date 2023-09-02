package com.rays.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.rays.oopconstructore.Person;

public class TestPerson {
	public static void main(String[] args) throws Exception {
		
		String str = "11/02/2023";
    	
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dob = sdf.parse(str);
        Person p = new Person("Dinesh", dob, "indore");
        System.out.println(p.getname());
        System.out.println(p.getaddress());
        System.out.println(p.getdob());
      
        
	}

}
