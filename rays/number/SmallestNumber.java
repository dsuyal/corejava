package com.rays.number;

public class SmallestNumber {

	public static void main(String[] args) {
		
		int []arr = {20,67,78,50,8};
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
		for (int j = 0; j < arr.length; j++) {
			
		if (arr[i]<min)min = arr[i]; 
			
				
			}
				
			}
		System.out.println("Smallest number is "+min);
		}

	}


