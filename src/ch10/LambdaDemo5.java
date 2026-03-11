package ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LambdaDemo5 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		Iterator<Integer> it = intList.iterator();
		
		for(int i = 10; i <= 30; i+= 10) {
			intList.add(i);
		}
		
		for(int i = 11; i <= 20; i += 2) {
			intList.add(i);
		}
		
		intList.forEach(System.out::print); //forEach의 매개변수로 Consumer라는 functionalInterface 타입으로 넣어주면 된다.
		
		System.out.println();
		
		while(it.hasNext()) {
			if(it.next() % 2 == 0) it.remove();
		}
		
		//return true면 remove
		intList.removeIf(num -> num % 2 ==0); //predicate Functionalinterface
		
		intList.forEach(System.out::print);
		
		intList.replaceAll(i -> i * 10); //UnaryOperator Functionalinterface 의 구현체 람다식
		
	}

}
