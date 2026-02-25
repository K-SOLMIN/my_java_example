package ch02;

public class Hello4 {
	public static void main(String[] args) {
		// 변수 선언과 초기화, 사용(참조)하기 전에 초기화가 되어 있어야 한다 = variable
		int firstValue = 3;
		//value1 = 10;
		System.out.println(firstValue);
		
		// 상수 선언과 초기화(재할당 불가), 사용 = constant
		final double NUMBER_PI = 3.14; //final은 값 제할당 불가능
		//PI = 3.14; 불가능
		System.out.println(NUMBER_PI);
		
		subFunction();
	}
	
	public static void subFunction() {
		System.out.println("hello");
	}
}
