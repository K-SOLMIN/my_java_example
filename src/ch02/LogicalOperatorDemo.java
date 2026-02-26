package ch02;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		//논리연산
		boolean a = true;
		boolean a1 = false;
		boolean b = true;
		boolean b1 = false;
		
		System.out.println(a && b); //true
		System.out.println(a && b1); //false
		
		System.out.println(a || b1); //true
		
		System.out.println(!a); //false
		
		System.out.println(a ^ b); //false
		
		//쇼트서킷
		//by zero 예제 ==> 쇼트 서킷으로 간단히 바꿔보자
		int i = 0;
		if(i == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(5 / i);
		}
		
		//뒤에 연산을 안하게 함으로써 (exception or 불필요한 연산) 을 피할 수 있다.
		//%%, ||의 피연산자 순서에 따라 결과가 달라진다
//		if((i != 0) && (5 / i > 0)) System.out.println("5를 0으로 나눈 값이 0보다 큽니다."); no exception
//		if((5 / i > 0) && (i != 0)) System.out.println("5를 0으로 나눈 값이 0보다 큽니다."); exception
		
		
	}

}
