package ch05;

public class BallArrayDemo {

	public static void main(String[] args) {
		Ball[] balls = new Ball[5];
		balls[0] = new Ball(5);
		balls[1] = new Ball(10);
		
		for(Ball b : balls) {
//			if(b == null) break;
//			b.info();
//			Object의 toString() --> getClass().getName() + "@" + Integer.toHexString(hashCode())
//			System.out.println(b.getClass().getName() + "@" + Integer.toHexString(b.hashCode()));
			System.out.println(b);
		}
	}

}

class Ball {
	//변수
	int radius;
	
	//생성자
	public Ball() { }

	public Ball(int radius) {
		this.radius = radius;
	}
	
	//메소드
	public void info() {
		System.out.println("크기가 " + radius + "인 공입니다.");
	}

	//*********************** 중 요 **************************//
	//Object의 toString override
	@Override
	public String toString() {
//		return String.format("크기가 %d인 공입니다.", radius);
		return String.format("Ball [radius = %d]", radius);
	}
	
	//모든 객체의 조상은 Object이다.
	
}
