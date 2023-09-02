package com.rays.thread;

public class TestWithThread {
	public static void main(String[] args) {
		
		WithThread t1 = new WithThread("Dinesh");
		
		WithThread t2 = new WithThread("Suyal");
		
		t1.setPriority(1);  // this is use for set priority minimum
		t2.setPriority(10);  //this is use for higher priority
		
		t1.start();
		t2.start();
		
	}

}
