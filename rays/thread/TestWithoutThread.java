package com.rays.thread;

public class TestWithoutThread {
	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("Dinesh");
		
		WithoutThread t2 = new WithoutThread("Suyal");
		
		t2.run();
		t1.run();
		
	}

}
