package ch04;

public class Circle {
	//필드
	private double radius = 10.0; //private을 붙혀 캡슐화(은닉)
	private final double PI = 3.14;
	
	//getter, setter 가져오는메소드와, 값을 초기화하는 메소드가 필요하다.
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		if(radius > 0) this.radius = radius;
	}
	
	//메소드
	double getArea() {
		return PI * radius * radius;
	}
}
