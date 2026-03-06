package ch06;

public class UpCastingDemo {

	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		circles[0] = new Circle();
		
		Triangle[] triangles = new Triangle[3];
		triangles[0] = new Triangle();
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Shape();
		shapes[1] = new Circle();
		shapes[2] = new Triangle();
		
		for(Shape shape : shapes) {
			shape.area();
		}
		
		drawShape(circles[0]);
		drawShape(triangles[0]);
	}
	
//	public static void drawShape(Circle circle) {
//		System.out.println("원을 그립니다.");
//	}
//	
//	public static void drawShape(Triangle triangle) {
//		System.out.println("삼각형을 그립니다.");
//	}
	
	public static void drawShape(Shape shape) {
		//원의 경우에는 반지름을 설정한 후 원을 그린다 //객체의 타입을 확인하는 연산자 : isntanceof(2항연산자)
		if(shape instanceof Circle) {
			Circle c = (Circle) shape; //다운캐스팅
			c.setRadius(5);
			c.draw();
			//삼각형이라면 밑변과 높이를 설정한 후 삼각형을 그린다.
			//변수의 instanceof(변수의타입이) 뒤 타입의 조건에 맞다면 t변수에 담아서 반환해준다.
		} else if(shape instanceof Triangle t) {
//			Triangle t = (Triangle) shape; //다운캐스팅
			t.setBase(5);
			t.setHeight(10);
			t.draw();
		}
		
	}

}

class Shape {
	//메소드
	public void draw() {
		
	}
	
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

	//메소드 - 오버라이드
	@Override
	public void area() {
		System.out.println("원의 넓이");
	}

}

class Triangle extends Shape {
	//필드
	private int base;
	private int height;
	
	//접근자, 설정자, toString
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("삼각형의 넓이");
	}
}
