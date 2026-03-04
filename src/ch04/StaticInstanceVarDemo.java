package ch04;

public class StaticInstanceVarDemo {
	
	public static void main(String[] args) {
		Circle2 c2 = new Circle2();
		Circle2.printStaticInfo();
		
		Circle2.numOfCircle++;
		Circle2.printStaticInfo();
		
		c2.printInfo();
		c2.radius = 1.0;
		c2.printInfo();
		
		Circle2 c3 = new Circle2();
		System.out.println("numOfCircle++ : " + Circle2.numOfCircle);
		
		Circle2 c4 = new Circle2();
		System.out.println("numOfCircle++ : " + Circle2.numOfCircle);
		
		Circle2 c5 = new Circle2();
		System.out.println("numOfCircle++ : " + Circle2.numOfCircle);
		
		System.out.printf("%d %d %d %d", c2.numOfCircle, c3.numOfCircle, c4.numOfCircle, c5.numOfCircle);
	}
}

class Circle2 {
	//필드 = 변수
	//클래스 변수
	static int numOfCircle; //Method영역에 올라갈때 0으로 초기화됨
	
	//인스턴스 변수
	double radius; //객체가 생성될때, 0.0으로 초기화됨
	
	//생성자
	public Circle2() {
		numOfCircle++;
	}
	
	//메소드 = 함수
	//클래스 메소드 class loader에 의해 메모리에 올라가짐
	static void printStaticInfo() {
		System.out.println("numOfCircle(생성된 원의 갯수) : " + numOfCircle);
	}
	
	//인스턴스 메소드, 객체가 생성될 때 메모리에 올라감
	void printInfo() {
		System.out.println("radius : " + radius);
	}
}