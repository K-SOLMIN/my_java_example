package ch02;
/*
 * 한 줄 짜리 주석 두 줄 짜리 주석
 */

/* 
	여기서 부터
	abcd
	abcd
	abcd
	여기까지가 주석입니다 --- 주석
*/
//int v1; // 변수의 선언
//v1 = 3; // 왼쪽의 변수에 오른쪽 값(리터럴)을 할당
// 메서도 호출
public class Hello3 { //클래스

	public static void main(String[] args) { //메서도 (특정 목적을 당성하기 위한 코드의 모음) 
		//메인 메서드 내부
		System.out.println("안녕"); // 화면에 문자열을 직접 출력
		int v1 = 3; // 변수의 선언과 값 할당을 동시에 함
		System.out.println(v1); // 화면에 변수의 값을 출력
		String str = "hello";
		System.out.println(str); // 화면에 변수의 값을 출력
		System.out.print(str);
		System.out.print(str);
		System.out.print(str);
		
		System.out.println();
		
		System.out.printf("%d     %d", v1, v1);
		System.out.printf(" %s %s", str, str);
		
		System.out.println();
		
		System.out.printf("%.20f   %f", 3.14, 3.14);
	}

}
