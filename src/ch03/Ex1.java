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
		
		//while문으로 변경
		System.out.println("================ while로 변경 =================");
		int i = 0;
		while(i < 10) {
			System.out.printf("%2d helloworld\n", i + 1);
			i++;
		}
		
		System.out.println("================ do - while로 변경 =================");
		//do-while 문으로 변경
		int num = 0;
		do {
			System.out.println("실행" + (num + 1));
			num++;
		} while(num < 10);
		
//		System.out.println(1 helloworld);
//		System.out.println(2 helloworld);
//		System.out.println(3 helloworld); ...
//		System.out.println(totalAmount);
//		System.out.println(totalAmount);
		
		//함수(메서드)를 활용한 프로그램의 재활용, 유지보수성을 높이기 위해
		
		//1부터 3까지의 합을 구하는 프로그램
		int sum = 0;
//		sum += 1; 0 + 1 = 1
//		sum += 2; 1 + 2 = 3
//		sum += 3; 3 + 3 = 6;
		
		for(int j = 1; j <= 3; j++) {
			sum += j;
		}
		
		System.out.println(sum(1, 3));
		//System.out.println(1 + 2 + 3);
		
		//4 부터 6까지의 합을 구하는 프로그램
		sum = 0;
//		sum += 4; 0 + 4 = 4
//		sum += 5; 4 + 5 = 9
//		sum += 6; 9 + 6 = 15;
		for(int j = 4; j <= 6; j++) {
			sum += j;
		}
		
		System.out.println(sum(4, 6));
		
		//7부터 9까지의 합을 구하는 프로그램(method로)
//		sum += 7; 0 + 7 = 7
//		sum += 8; 7 + 8 = 15
//		sum += 9; 15 + 9 = 24;
		System.out.println(sum(7, 9));
		
		System.out.println(sum);
	} // end of main method
	
	//method의 반환타입이 void이면 컴파일러가 자동으로 return을 붙임
	public static int sum(int startNum, int endNum) {
//		sum += startNum
//		sum += j
//		sum += j
//			.
//			.
//			.
//		sum += endNum
		int sum = 0;
		
		for(int j = startNum; j <= endNum; j++) {
			sum += j;
		}
		
		return sum;
	}
} //end of Ex1 class
