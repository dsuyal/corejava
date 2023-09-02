package com.rays.oopconstructore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

    public static void main(String[] args)throws Exception{
    	
    	String str = "11/02/2023";
    	
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
       
        Date dob = sdf.parse(str);
        
		Person p = new Person("dinesh", dob, "indore");
        
        System.out.println(p.getname());
        System.out.println(p.getdob());
        System.out.println(p.getaddress());
    }

}
