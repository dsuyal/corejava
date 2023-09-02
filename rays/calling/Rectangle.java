package com.rays.calling;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle() {
		
	} 
	public Rectangle(int length,int width) {
		super("Green",100);
		this.length = length;
		this.width = width;
		
	}
	public Rectangle(int length,int width,String color,int borderWidth) {
		super(color,borderWidth);
		this.length = length;
		this.width = width;
	}
	public int getlength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getwidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public double area() {
		
		int rArea = getlength() * getwidth();
				System.out.println("Rectangle Area = "+ rArea);
				return rArea;
		}
	}



