
package com.rays.calling;

public class TestShape {
public static void main(String[] args) {
	
	Shape s = new Shape("red", 10);
	
	Rectangle r = new Rectangle(10, 20);
	
	System.out.println(s.getBoarderWidth());
	System.out.println(s.getcolor());
	System.out.println(r.getlength());
	System.out.println(r.getwidth());
	System.out.println(r.area());
		
	} 

}
