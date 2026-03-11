package ch10;

import java.util.Arrays;

public class ComparatorLambdaDemo {

	public static void main(String[] args) {
		String[] strArr = {"abc", "hello", "bcd", "fab", "i"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
//		Arrays.sort(strArr, new Comparator<String>() {
//
//			@Override
//			public int compare(String pre, String next) {
//				return next.compareTo(pre);
//			}
//		});
		
		Arrays.sort(strArr, (pre, next) -> next.compareTo(pre));
		
		System.out.println("사전순 내림차순 : " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, (pre, next) -> next.length() - pre.length());
		
		System.out.println("길이 오름차순 : " + Arrays.toString(strArr));
	}

}
