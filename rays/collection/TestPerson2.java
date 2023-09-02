package com.rays.collection;

public class TestPerson2 {
public static void main(String[] args) {
	
	Person p1 = new Person(1, "dinesh", "indore");
	Person p2 = new Person(1, "dinesh", "address");
	
	
	System.out.println(p1.equals(p2));
}

}
