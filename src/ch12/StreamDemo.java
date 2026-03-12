package ch12;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> gt5List = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) >= 5) gt5List.add(list.get(i));
		}
		
		for(int i = 0; i < gt5List.size(); i++) {
			if(gt5List.get(i) % 2 == 0) even.add(gt5List.get(i));
		}
		
		System.out.println(even);
		
		list.stream().filter(e -> e >= 5)
						.filter(e -> e % 2 == 0)
						.forEach(System.out::println);
	}

}
