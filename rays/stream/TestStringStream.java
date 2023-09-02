package com.rays.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStringStream {
	public static void main(String[] args) {
		
		String [] arr = {"one","two","three","four"};
		
		List<String>list = Arrays.asList(arr);
		
		Stream<String>stream = Arrays.stream(arr);
		
		stream.sorted().forEach(System.out :: println);
	}

}
