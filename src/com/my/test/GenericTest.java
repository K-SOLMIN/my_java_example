package com.my.test;

public class GenericTest {
	public static void main(String[] args) {
		Generic<Human> generic = new Generic<>();
		generic.yeah(new Human());
	}
}

class Generic<T> {
	public void yeah(T t) {
		System.out.println("generic method 실행");
	}
}

class Human {
	
}

class Animal {
	
}
