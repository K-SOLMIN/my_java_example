package com.my.test;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		String str = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			str.length();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("온다고?");
		
		System.out.print("입력 : ");
		str = sc.nextLine();
		
		System.out.println("str : " + str);
	}

}
