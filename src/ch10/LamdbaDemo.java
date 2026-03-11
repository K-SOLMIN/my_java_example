package ch10;

public class LamdbaDemo {

	public static void main(String[] args) {
		//람다는 익명클래스로 만든 익명객체(메소드)
//		int result = 
//				new Object() {
//					int max(int a, int b) {
//						return a > b ? a : b;
//					}
//				}.max(10, 20);
					
//		System.out.println(result);
		
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
		
//		System.out.println(mi.max(10, 20));
//		System.out.println(mi.max(10, 5));
		
		MyInterface mi = (a, b) -> a > b ? a : b;
		
		System.out.println(mi.max(10, 20));
		System.out.println(mi.max(10, 5));
		
		
	}

}

//함수형 인터페이스 - 추상메소드 단 하나만을 가지는 인터페이스
@FunctionalInterface
interface MyInterface {
	int max(int a, int b);
	
	//2개 0개 안됨
//	int min(int a, int b);
}
