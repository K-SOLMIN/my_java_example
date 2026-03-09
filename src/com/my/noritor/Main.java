package com.my.noritor;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("가나다", 12);
		Person p2 = new Person("가나다", 12);
		
		System.out.println("p1.hashCode() : " + p1.hashCode());
		System.out.println("p1.hashCode() : " + p2.hashCode());
		
		Set set = new HashSet();
		set.add(p1);
		set.add(p2);
		
		set.stream().forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("Aa".hashCode());
		System.out.println("BB".hashCode());
	}

}
