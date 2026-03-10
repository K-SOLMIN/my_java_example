package ch09;

import java.util.ArrayList;

public class ArrayListGenericDemo {
	public static void main(String[] args) {
		//배열의 원소 E 타입 T
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(3.14);
		list.add("abc");
		list.add("Circle");
		
		Object i = list.get(0);
		
		if(i instanceof Integer integer) {
			System.out.println(integer + 10);
		}
		
//		i = list.get(1);
//		Integer i3 = (Integer) i;
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
//		intList.add(3.14);
		
		int num = intList.get(0);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("abc");
//		strList.add(10);
		String str =  strList.get(0);
		
		 
	}
}
