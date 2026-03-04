package ch05;

public class StringStaticMethodDemo {

	public static void main(String[] args) {
		//숫자를 문자열로 만드는방법 : 숫자 + "", String.valueOf();
		//정수, 실수 를 문자열로 만들어보자
//		String str = 3 + "";
		String str = String.valueOf(3.14);
		
		System.out.println(str);
		
		//여러 타입의 변수들을 내가 원하는 포멧의 문자열로 만드는 방법 : String.format();
		System.out.println("PI = " + str + " 입니다.");
		String str2 = String.format("%s = %.2f 입니다", "PI", 3.14);
		System.out.println("String.format() : " + str2);
		
		
	}

}
