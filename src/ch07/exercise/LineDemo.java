package ch07.exercise;

public class LineDemo {
//	(길이가 10인 Line l1 과 길이가 20인 Line l2가 주어졌을 경우) :
//		Line [length = 20] 이 더 깁니다.
	public static void main(String[] args) {
		Line l1 = new Line(10);
		Line l2 = new Line(20);
		
		if(l1.compareTo(l2) > 0) {
			System.out.printf("Line [length = %d] 이 더 깁니다.", l1.getLength());
		} else if(l1.compareTo(l2) == 0) {
			System.out.println("equal");
		} else {
			System.out.printf("Line [length = %d] 이 더 깁니다.", l2.getLength());
		}
	}
}
