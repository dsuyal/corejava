package com.rays.oopconstructore;

public class Circle extends Shape {
	
	private double radius = 0;
	
	public static final double PI = 3.14;
	
	public Circle () {
		
	}
	public Circle (int radius) {
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double area() {

		double cArea = PI * getRadius() *  getRadius();

		System.out.println("Circle Area = " + cArea);

		return cArea;

	}
}
