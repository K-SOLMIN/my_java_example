package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {
		//소리가 1시간동안 가는 거리
		int mach;
		int distance;
		mach = (int) 340.0; //double 또는 float 를 int로 명시적(강제) 형변환
		distance = 60 * 60 * mach;
		System.out.printf("소리가 1시간 동안 가는 거리는 %dm 입니다 \n", distance);
		
		//반지름이 10.0 인 원의 넓이
		final double PI = 3.14;
		//int radius = 10;
		double radius = 10; //int가 double로 자동 변환
		double area = PI * radius * radius;
		System.out.printf("반지름이 10.0인 원의 넓이는 %.2f입니다", area);
		
		long l = (long) 3.14;
	}

}
