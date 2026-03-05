package ch06.exercise;

public class Ex01 {

	public static void main(String[] args) {
		Circle r5Circle = new Circle(5);
		r5Circle.show();
		
		ColoredCircle r10ColoredCircle = new ColoredCircle(10, "빨간색");
		r10ColoredCircle.show();
	}

}

class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
}

class ColoredCircle extends Circle {
	String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}
}
