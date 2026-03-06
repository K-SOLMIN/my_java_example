package ch07;

public class AbstractDemo {

	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		circles[0] = new Circle();
		
		Shape[] shapes = new Shape[3];
		
		drawShape(circles[0]);
	}
	
	public static void drawShape(Shape shape) {
		if(shape instanceof Circle) {
			Circle c = (Circle) shape; //다운캐스팅
			c.setRadius(5);
			c.draw();
		}
		
	}

}

abstract class Shape {

	//추상 메소드
	abstract void draw();
	
	public void area() {
		System.out.println("도형의 넓이");
	}
}

class Circle extends Shape {
	//필드
	private int radius;
	
	//접근자, 설정자, toString
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("원의 넓이");
	}
	
	//abstract 클래스의 미구현 메소드 구현
	@Override
	void draw() {
		System.out.println("원을 draw");
	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("rectangle을 그리다");
	}
	
}
