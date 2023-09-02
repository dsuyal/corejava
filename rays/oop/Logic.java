package com.rays.oop;

public class Logic {
	
	public void sum(int a, int b) {
		
		int c = a + b;
		
		System.out.println("sum = " + c);
	}
	
	public static void mult(int a, int b) {
		
		int c = a * b;
		
		System.out.println("Multiplication is = "+ c);
	}	
	public void notecount(int number) {
		int[]note = {2000,500,200,100,50,20,10,5,2,1};
		int count = 0;
		for (int i = 0; i < note.length; i++) {
			count = number/note[i];
			if(count>0) {
				System.out.println(note[i]+"="+count);
				
				
			}
			number = number % note[i];
		}
	}
	public void largest(int[]arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println("max ="+ max);
	}
	
}
			
		
	

