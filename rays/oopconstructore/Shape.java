package com.rays.oopconstructore;

public class Shape {

	private String color = null;
	private int borderWidth = 0;
	
	public Shape () {
	
	}
	public Shape (String color,int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
	}
		
	public void setcolor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public double area() {
		System.out.println("Shape area method...!!!");
		return 0;
	}

}
