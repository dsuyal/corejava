package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Testvector {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	v.add(100);
	v.add("one");
	v.add("20");
	
	Enumeration e = v.elements();
	
	v.add(2);
	
	while(e.hasMoreElements()) {
	
	System.out.println(e.nextElement());
	}
	
  }

}
