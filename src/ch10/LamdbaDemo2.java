package ch10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdbaDemo2 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a", "b", "d", "c");
		
		Collections.sort(list); //오름차순
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a); //내림차순
			}
		});
		
		System.out.println(list);
		
		Collections.sort(list, (a, b) -> a.compareTo(b)); //다시 오름차순
		
		System.out.println(list);
		
		
	}
}
