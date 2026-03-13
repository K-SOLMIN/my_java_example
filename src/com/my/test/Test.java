package com.my.test;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		
		OuterClass.InnerStaticClass innerStatic = new OuterClass.InnerStaticClass();
		Random random = new Random();
		while(true) {
			System.out.print(random.nextInt(10) + " ");
		}
	}
}


class OuterClass {
	
	
	class InnerClass {
		void innerMethod() {
			System.out.println("innerMethod");
		}
	}
	
	static class InnerStaticClass {
		
	}
}