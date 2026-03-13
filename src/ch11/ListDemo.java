package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// 1) new ArrayList<>() -> 원소 삽입,삭제 Set 사용해서 원소 수정 CRUD(CREATE, READ, UPDATE, DELETE)
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.get(0);
		intList.set(0, 20);
		intList.remove(0);
		
		// 2) Arrays.asList() -> 원소 삽입,삭제 Set 사용해서 원소 수정 CRUD(CREATE, READ, UPDATE, DELETE)
		intList = Arrays.asList(1, 2, 3);
		
//		intList.add(10); 추가, 삭제 안됨    수정만 가능
//		intList.remove(2);
		System.out.println(intList.get(0));
		intList.set(0, 10);
		System.out.println(intList.get(0));
		
		// 3) List.of() -> 원소 삽입,삭제 Set 사용해서 원소 수정 CRUD(CREATE, READ, UPDATE, DELETE)
		//추가 삭제 수정 다 안됨
		intList = List.of(1, 2, 3);
		System.out.println(intList.get(0));
//		intList.add(10); 
//		intList.remove(0);
//		intList.set(0, 10);
		
		//List.of() 불변객체를 ArrayList 생성자의 매개변수로 넣어주면 가변객체로 만들 수 있다.(CUD 가능)
		List<Integer> newList = new ArrayList<>(intList);
		System.out.println(intList.get(0));
		newList.add(10);
		newList.remove(0);
		newList.set(0, 10);
		
		//가변객체(CRUD) ArrayList를 크기가 고정된 Array로 다시 변환하는 방법
		Integer[] intArr = newList.toArray(new Integer[3]); //toArray는 배열만들때 크기도 정해줘야함 new Integer[] 이렇게는 안됨
		System.out.println(Arrays.toString(intArr));
	}

}
