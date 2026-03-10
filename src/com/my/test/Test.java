package com.my.test;


public class Test {
	public static void main(String[] args) {
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		
		OuterClass.InnerStaticClass innerStatic = new OuterClass.InnerStaticClass();
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