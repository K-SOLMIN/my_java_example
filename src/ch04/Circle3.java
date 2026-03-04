package ch04;

public class Circle3 {
	String color;
	double radius;
	
	//생성자 오버로딩
	public Circle3() {
//		color = "red";
//		radius = 1.0;
		this("red", 1.0);
	}
	
	public Circle3(String color) {
//		this.color = color;
//		radius = 1.0;
		
//		this.color = "blue"; 생성자와 다른코드를 같이 쓸때는 먼저 생성한후 값을 바꿔야한다. 이 코드는 X
		this(color, 1.0);
		this.color = "blue";
	}
	
	public Circle3(double radius) {
//		color = "red";
//		this.radius = radius;
		this("red", radius);
	}
	
	public Circle3(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}
	
	public void printInfo() {
		System.out.printf("원의 색깔은 %s, 반지름은 %.1f\n", color, radius);
	}
}
