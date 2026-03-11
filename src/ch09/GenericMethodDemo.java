package ch09;

import ch04.Person;

public class GenericMethodDemo { //outer class

	public static void main(String[] args) {
		Integer[] intArr = {1, 2, 3, 4};
		String[] strArr = {"a", "b", "c"};
		Long[] longArr = {10L, 20L, 30L};
		Double[] doubleArr = {1.0, 2.0, 3.0};
		Person[] personArr = {new Person()};
		
		Utils.showArrays(intArr);
//		Utils.showArrays(strArr); 
		Utils.showArrays(longArr);
		Utils.showArrays(doubleArr);
//		Utils.showArrays(personArr);
	}
	
	static class Utils { //inner class
		
		//메소드 오버로딩으로 할 경우 오버로딩할 메소드가 많아진다.
		//generic으로 해결
		
//		static <T extends Comparable<Object>> void showArrays(T[] arr) comparable 인터페이스 구현체만 들어올 수 있도록 제한
		static <T extends Number> void showArrays(T[] arr) { //숫자만 T에 올수있게 제한
			for(T t : arr) {
				System.out.println(t);
			}
		}
		
//		static void showArrays(int[] a) {
//			for(int i : a) {
//				System.out.println(i);
//			}
//		}
//		
//		static void showArrays(long[] longArr) {
//			for(long l : longArr) {
//				System.out.println(l);
//			}
//		}
//
//		static void showArrays(String[] a) {
//			for(String str : a) {
//				System.out.println(str);
//			}
//		}
		
//		static void showArrays(String[] strArr) {
//					
//		}
//		
//		static void showArrays(Integer[] strArr) {
//			
//		}
//		
//		static void showArrays(Long[] strArr) {
//			
//		}
	}

}
