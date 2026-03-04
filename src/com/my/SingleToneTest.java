package com.my;

public class SingleToneTest {
	public static SingleToneTest singleToneTest;
	
	public static SingleToneTest getSingleToneTest() {
		if(singleToneTest == null) {
			System.out.println("실행");
			return singleToneTest = new SingleToneTest();
		} else {
			return singleToneTest;
		}
	}
	
	private SingleToneTest() { }
	
	public void singleToneTest() {
		
	}
}
