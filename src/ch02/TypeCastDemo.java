package ch02;

public class TypeCastDemo {

	public static void main(String[] args) {
		// 연산에서의 자동 환변환 / <- 정수의 나눗셈(정수만 반환)
		int v1 = 10;
		int v2 = 3;
		int res1 = v1 / v2;
		//double res1 = (double) v1 / v2 => 3.3333...
		//double res1 = v1 / v2 => 3.0
		//double res = 7 / 4 ==  (double) 7 / 4
		System.out.println(res1);
		
		//실수의 나눗셈 -> 실수부분 까지 포함한 결과
		double res2 = 10.0 / 3.0;
		System.out.println(res2);
		
		// 실수 나누기 정수
		double res3 = 10.0 / 3;
		System.out.println(res3);
		
//		int res4 = 
		
	}

}
