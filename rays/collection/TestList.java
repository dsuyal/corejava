package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	
	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		l1.add(1);
		l1.add("one");
		l1.add(1);
		l1.add("two");
		l1.add(null);
		
		System.out.println("l1 after add = "+ l1);
		
		System.out.println();
	
		System.out.println("l1 after get index 2 = "+ l1.get(2));
		
		System.out.println("l1 after Remove = " + l1.remove("one"));
		
	
	}
}
