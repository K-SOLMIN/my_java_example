package ch05.exercise;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		String[] name = {"가위", "바위", "보"};
		int randomNum = 0;
		
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		
		for(int i = 0; i < 10; i++) {
			randomNum = (int) (Math.random() * 3);
			System.out.println(name[randomNum]);
		}
	}
}
