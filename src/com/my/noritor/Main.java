package com.my.noritor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Person p1 = new Person("가나다", 12);
//		Person p2 = new Person("가나다", 12);
//		
//		System.out.println("p1.hashCode() : " + p1.hashCode());
//		System.out.println("p2.hashCode() : " + p2.hashCode());
//		
//		Set set = new HashSet();
//		set.add(p1);
//		set.add(p2);
//		
//		set.stream().forEach(e -> {
//			System.out.println(e);
//		});
		
//		System.out.println("Aa".hashCode());
//		System.out.println("BB".hashCode());
//		System.out.println("Aa".hashCode() == "BB".hashCode());
//		
//		System.gc();
		
//		String[] strArr = {"a", "b", "c", "d"};
//		String[] strArr2 = new String[strArr.length * 2];
//		
//		for(int i = 0; i < strArr2.length; i++) {
//			if(i < strArr.length) {
//				strArr2[i] = strArr[i];
//			} else {
//				strArr2[i] = null;
//			}
//		}
//		
//		System.out.println(Arrays.toString(strArr2) + " " + strArr2.length);
		
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < 5; i++) {
			list.add(i, i);
		}
		
		System.out.println(list.get(3));
	}

}
