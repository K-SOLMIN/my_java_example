package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = {"포도", "사과", "망고", "바나나"};
		List<String> list = Arrays.asList(fruits);
		
		Collections.sort(list);
		System.out.println("sort : " + list);
		
//		Collections.sort(list, (pre, next) -> next.compareTo(pre));
//		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Collections.reverseOrder : " + list);
		
		Collections.reverse(list);
		System.out.println("Collections.reverse(List<>) : " + list);
	}

}
