package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(); //맨뒤에 넣을때 효율좋음 맨앞은 효율 박살남
		LinkedList<Integer> ll = new LinkedList<>();//반대
		
		//10만건의 데이터 추가 1) 맨뒤일떄/맨앞일떄
		long start = System.nanoTime();		
		for(int i = 0; i < 100_000; i++) al.add(i);
		long end = System.nanoTime();
		
		System.out.println("ArrayList 로 처리한 시간 : " + (end - start));
		
		start = System.nanoTime();
		for(int i = 0; i < 100_000; i++) ll.add(i);
		end = System.nanoTime();
		
		System.out.println("LinkedList 로 처리한 시간 : " + (end - start));
		
		long delstart = System.nanoTime();		
		for(int i = 0; i < 100_000; i++) al.remove(i);
		long delend = System.nanoTime();
		
		System.out.println("LinkedList 로 삭제한 시간 : " + (delend - delstart));
		
		delstart = System.nanoTime();
		for(int i = 0; i < 100_000; i++) ll.removeFirst();
		delend = System.nanoTime();
		
		System.out.println("LinkedList 로 삭제한 시간 : " + (delend - delstart));
		
		
		
		
		
		
	}

}
