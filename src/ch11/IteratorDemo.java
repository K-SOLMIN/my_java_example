package ch11;

import java.util.Collection;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {
		// SOLID 의 원칙중 DIP (Dependency Inversion Principle) 을 지키지 않은 예제
		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.addFirst(10);
//		list.addFirst(20);
//		list.addFirst(30);
		
//		System.out.println(list);
		
		
		
		
		
		// SOLID 의 원칙중 DIP (Dependency Inversion Principle) 을 지키지 않은 예제
		Collection<String> list = new LinkedList<>(); //new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list);
	}

}
