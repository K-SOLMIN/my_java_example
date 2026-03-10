package ch08;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// 문자
		String[] arr = {"j", "a", "v", "a"};
		String [] arr2 = {"j", "a", "v", "a"};
		
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] arr1 = Arrays.copyOf(arr, 2); //param1 : 원본배열 param2 : 2번째자리 2번index아님 2개
		System.out.println(Arrays.toString(arr1));
		
		int index = Arrays.binarySearch(arr, "v"); //param1 배열, param2 찾을 문자 return index 몇번 index에있는지 반환
		System.out.println(index);
		
		System.out.println(Arrays.equals(arr, arr2)); //index의 값 자체가 같아야함 크기, 순서, 값 셋다 같아야함
	}

}
