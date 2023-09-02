package com.rays.number;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
public static void main(String[] args) {
	
	Collection c = new ArrayList();
	
	c.add("Bura mat Dekho");
	c.add("Bura mat suno");
	c.add("Bura mat Kaho");
	
	System.out.println("Length of Collection:" + c.size());
	
	for (Object ele : c) {
		System.out.println(ele);
	}
	Object[] oArray = c.toArray();
	
	for (Object ele : oArray) {
		String s = (String) ele;  
		System.out.println(s);
	}

	
		
		
	}

}
