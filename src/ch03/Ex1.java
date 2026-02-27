package ch03;

public class Ex1 {
	public static void main(String[] args) {
		//변수릃 활용한 프로그램의 가독성, 재활용, 유지보수성이 높은 프로그램
		//3 * 4 의 결과를 3번 출력해주세요 -> 4 * 5를 3번 출력해달라 -> 5 * 6을 5번
		int x = 50;
		int y = 60;
		int totalAmount = x * y;

		//반복문을 활용한 프로그램의 재활용
		//for(초기식; 조건식; 증감식) { ... } 초기식/조건식은 내 맘이다 단 가독성있게 하는것이 중요
		for(int i = 0; i < 10; i++) {
			System.out.println("totalAmount : " + totalAmount);
		}
		
//		for( ; ; ) {
//			System.out.println(totalAmount); -> 무한반복
//		}
		
		for(int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + " helloworld");
			System.out.printf("%2d helloworld\n", i + 1);
		}
//		System.out.println(1 helloworld);
//		System.out.println(2 helloworld);
//		System.out.println(3 helloworld); ...
//		System.out.println(totalAmount);
//		System.out.println(totalAmount);
		
		//함수(메서드)를 활용한 프로그램의 재활용

	}
}
