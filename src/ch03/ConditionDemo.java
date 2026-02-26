package ch03;

public class ConditionDemo {
	public static void main(String[] args) {
		//조건문 (if, switch)
//		if(조건식) { ... } 조건식이 true이면 {}안의 샐행문이 실행됨.
		int i = 0;
		if(i == 0) {
			System.out.println("hello, world");
		}
		
		int j = 0;
		if(j == 0) 
			System.out.println("hello, world");
		
//		int k = 0;
//		if(k == 0);							<- 조건식에 의한 실행이아님
//		System.out.println("hello world");
		
		//3 < a < 5 실행하는 조건문
		int a = 4;
		if(3 < a && a < 5) System.out.println("3 < a < 5");
		
		//x가 0보다 작거나 100보다 크면 실행하는 조건문
		int x = -1;
		if(x < 0 || x > 100) System.out.println("x가 0보다 작거나 100보다 크면 실행하는 조건문");
		
		//짝수인지 홀수인지 출력하는 조건문
		int res = 3 % 2;
//		if(res == 0) System.out.println("짝수입니다.");
//		if(res == 1) System.out.println("홀수입니다."); <- 매우나쁨 불필요한 연산함
		
		if(res == 0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
		
		//삼항연산자
		String result = res == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(result);
		
	}
}
