package com.my.test;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		int[] intArr = {1, 3, 10, 2, 49, 5};
		
		int[] resultArr = Arrays.stream(intArr).filter(e -> e > 5).toArray();
		
		System.out.println(Arrays.toString(resultArr));
		
		List<Integer> intList = List.of(1, 3, 10, 2, 49, 5);
		
		Integer[] integerArr = (Integer[])  intList.stream().filter(e -> e > 5).toArray();
		
		
		
	}

}
