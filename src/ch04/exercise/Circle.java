package ch04.exercise;

public class Circle {
	/*
	 * 예제 : Circle instance를 만들 때마다 빨간색의 크기가 100인 circle이 1개 생성되었습니다. 노란색의 크기가 50인
	 * circle이 2개 생성되었습니다.
	 */
	
	//필드
	private static int numOfCircle;
	private String color;
	private double radius;
	int numCircle;
	
	//생성자
	public Circle(String color, double radius) {
		numOfCircle++;
		numCircle++;
		this.color = color;
		this.radius = radius;
		printInfo();
	}
	
	//메소드
	private void printInfo() {
//		System.out.println(this.color + "의 크기가 " + this.radius 
//				+ "인 circle이 " + numOfCircle + "개 생성되었습니다.");
		System.out.printf("%s, 크기가 %.1f 인 공이 %d 개(%d) 생성되었습니다.\n", 
									color, radius, numOfCircle, numCircle);
	}
	
	/*
	 * **중요**
	 * 정적(static) 메소드는 자기자신(this) 를 반환할수없다 
	 * 인스턴스(non-static) 변수 접근 불가 
	 * 인스턴스(non-static) 메소드 호출 불가
	 */
	static void staticMethod() {
//		return this;
//		radius = 1;
//		printInfo();
		staticMethod2(); //static으로 선언된 변수/메소드 에만 접근가능하다.
						 //반대로 non-static(인스턴스) 변수/메소드는 static으로 선언되 변수/메소드 접근 가능하다.
	}
	
	static void staticMethod2() {
		
	}
}
