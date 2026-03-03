package ch04;

public class BallDemo {

	public static void main(String[] args) {
		Ball ball = new Ball();
		//공의 반지름을 출력
		System.out.println("공의 반지름 : " + ball.getRadius());  
		
		//공의 부피를 알아내서 출력
		System.out.println("공의 부피 : " + ball.getVolume());
		
		//공의 반지름을 반으로 줄이고, 공의 부피를 출력
		ball.setRadius(ball.getRadius() / 2);
		System.out.println("공의 부피 : " + ball.getVolume() + " 공의 반지름 : " + ball.getRadius());
	}

}
