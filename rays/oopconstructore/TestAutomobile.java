package com.rays.oopconstructore;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile a = new Automobile("color = red", 100, "make = mustang");
        
        System.out.println(a.getcolor());
        System.out.println(a.getspeed());
        System.out.println(a.getmake());
    }

}

