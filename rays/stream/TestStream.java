package com.rays.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestStream {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		IntStream stream = Arrays.stream(arr);
		
		//stream.forEach(System.out::println);
		
		//stream.forEach(e ->{
		//System.out.println(e);
		
		stream.filter(e -> e % 2 ==1).forEach(e ->{  //if we place 0 in place of 1 than
														//even no. will be print
			System.out.println(e);
		});
	}

}
