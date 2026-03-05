package ch05;

import java.util.Arrays;

public class MainArgsDemo {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		for(String str : args) {
			System.out.println(str);
		}
	}

}
