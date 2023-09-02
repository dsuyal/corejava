package com.rays.number;

public class HigestNumber {

	public static void main(String[] args) {
		
		int [] arr = {121,123,154,678,890};
		
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > a) {
				a = arr[i];
			}
			
		}
		System.out.println(a);
	}

}
