 package ch02;

public class OperatorDemo {
	public static void main(String[] args) {
		//오버플로우 발생을 막기위해 피연산자중 하나를 타입 변환 했음
//		int i = 1_000_000;
//		int j = 2_000_000;
//		
//		long result = (long) i * j;
//		System.out.println(result);
		
		//무한대와 NaN 예제
//		Exception(프로그램 실행중[메모리에 올라간 상태] 뜨는 오류) in thread "main" java.lang.ArithmeticException(infinite/NaN[not a number]): (에러뜬 이유)/ by zero
//				(위치) at ch02.OperatorDemo.main(OperatorDemo.java:13)
//		int res = 5 / 0;
		
		double res = 5 / 0.0;
		System.out.println(res + 100);
		System.out.println(Double.isInfinite(res));
		
		if(Double.isInfinite(res)) System.out.println("무한대 값을 반환했습니다.");
		else System.out.println(res + 100);
		
		double res2 = 5 % 0.0; 
		System.out.println(res2);

		if (Double.isNaN(res2))	System.out.println("숫자가 아닙니다.");
		else System.out.println(res2 + 100);
		
		//25 나누기 2 의 나머지는 1입니다.
		int result = 25 % 2;
		System.out.printf("25나누기 2의 나머지는 %d 입니다.", result);
	}
}
