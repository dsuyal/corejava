package com.rays.calling;

public class Shape {
	
	private String color  = null;
	private int boarderWidth = 0;
	
	public Shape() {
		System.out.println();
	}
	public Shape (String color, int boarderWidth) {
		this();
		this.color = color;
		this.boarderWidth = boarderWidth;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public int getBoarderWidth() {
		return boarderWidth;
	}
	public void setBoarderWidth(int boarderWidth) {
		this.boarderWidth = boarderWidth;
	}
	
	public double area() {
		System.out.println("Shape area method...!!!");
		return 0;
		

	}

}
