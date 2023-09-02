package com.rays.oopconstructore;

public class Automobile {

	    private String color;
	    private int speed;
	    private String make;

	    public Automobile() {

	    }

	    public Automobile(String color, int speed, String make) {
	        this.color = color;
	        this.speed = speed;
	        this.make = make;
	    }

	    public void setcolor(String color) {
	        this.color = color;
	    }

	    public String getcolor() {
	        return color;
	    }

	    public void setspeed(int speed) {
	        this.speed = speed;
	    }

	    public int getspeed() {
	        return speed;
	    }

	    public void setmake(String make) {
	        this.make = make;
	    }

	    public String getmake() {
	        return make;
	    }
	}


