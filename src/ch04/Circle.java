package ch04;

public class Circle {
	//필드
	private double radius; //private을 붙혀 캡슐화(은닉), 인스턴스 변수
	private final double PI = 3.14;
	
	
	//생성자
	//**생성자를 class에 정의하지 않았다면 컴파일러가 자동으로 기본 생성자를 만든다.(명시적 생성자가 없는 경우)
	//추가적 요구사항 - 이 원은 만들어질때 반지름이 10으로 생성되도록 생성자를 추가해줘
	//추가 요구사항(v2.0) - 내가 생성하고 싶은 반지름을 매개변수로 전달하면 그 값을 이용해서 반지름을 생성해줘 
	public Circle() {
		radius = 10.0;
	}
	
	//이런식으로 생성자를 명시했다면 기본생성자 또한 명시해줘야한다.(매개변수있는 생성자를 만들었기에 위에 기본생성자를 만들어줘야함)
	public Circle(double radius) {
		if(radius > 0) this.radius = radius;
		else this.radius = 10.0;
	}
	
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
