package com.my.test;

public class Yeah {

	public static void main(String[] args) {
		int num = inOut(1);
		String str = inOut("abc");
		
		System.out.println(num + " : " + str);
	}
	
	static <T> T inOut(T param) {
		return param;
	}

}
