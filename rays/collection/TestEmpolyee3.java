package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmpolyee3 {
public static void main(String[] args) {
			
			Employee e1 = new Employee(1, "yash", "indore");
			
			Employee e2 = new Employee(2, "aryan", "indore");
			
			ArrayList<Employee> list = new ArrayList<Employee>();
			
			list.add(e1);
			list.add(e2);
			
			
			Iterator<Employee> it = list.iterator();
			
			while (it.hasNext()) {
				
			Employee e = (Employee)it.next();
			System.out.println(e);
			
			it.remove();
					
		}

			System.out.println(list);
	}
}

		




