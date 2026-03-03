package ch04;

public class CircleDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("원의 넓이는 : " + circle.getArea() + "입니다.");
		//System.out.println("원의 반지름은 : " + circle.radius + "입니다."); //필드 은닉전
		System.out.println("원의 반지름은 : " + circle.getRadius() + "입니다.");//필드 은닉후
		
		//변수 = 값 --> 값을 왼쪽의 변수에 할당(저장)한다.
		//circle.radius = 5; //은닉전
		circle.setRadius(5); //은닉후
		System.out.println("원의 넓이는 : " + circle.getArea() + "입니다.");
		//System.out.println("원의 반지름은 : " + circle.radius + "입니다.");
		System.out.println("원의 반지름은 : " + circle.getRadius() + "입니다.");
		
		circle.setRadius(0);
		System.out.println("원의 넓이는 : " + circle.getArea() + "입니다.");
		System.out.println("원의 반지름은 : " + circle.getRadius() + "입니다.");
		
		circle.setRadius(-10);
		System.out.println("원의 넓이는 : " + circle.getArea() + "입니다.");
		System.out.println("원의 반지름은 : " + circle.getRadius() + "입니다.");
	}

}
