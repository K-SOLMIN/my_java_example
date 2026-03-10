package com.my.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionInterTest {

	public static void main(String[] args) {
		Ramda ramda = new Ramda() {
			@Override
			public void test() {
				System.out.println("Hello");
			}
		};
		
		ramda.test();
		
		Ramda ramdaTest = () -> System.out.println("Hello");
		ramdaTest.test();
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 300; i++) {
			intList.add(i);
		}
		
		intList.sort((pre, next) -> next - pre);
		
		intList.forEach(System.out::println);
		
		intList.stream().filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t < 100;
			}
		});
		
		System.out.println("============= stream사용후 ================");
		Integer[] intArr = intList.stream().filter(e -> e < 100).sorted((pre, next) -> pre - next).toArray(Integer[]::new);
		for(int num : intArr) {
			System.out.println(num);
		}
	}

}

@FunctionalInterface
interface Ramda {
	void test();
}
