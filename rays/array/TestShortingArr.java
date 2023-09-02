package com.rays.array;

public class TestShortingArr {

	public static void main(String[] args) {
		
		int []arr = {10,5,15,25,18,50,1};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			System.out.println(arr[i]);
		}

	}

}
