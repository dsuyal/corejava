package com.rays.collection;

import java.util.ArrayList;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "yash", "indore");
		
		Employee e2 = new Employee(2, "aryan", "indore");
		
		ArrayList list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		
		Employee e = (Employee)list.get(0);
		
		System.out.println(e);
		
		System.out.println(e.getid());
		
		System.out.println(e.getname());
		
		System.out.println(e.getaddress());
				
	}

}

	

