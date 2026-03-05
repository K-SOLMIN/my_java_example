package ch06.exercise;

public class Ex06 {
	
	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();
	}
}

class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.printf("색 $s, 속도 $d", color, speed);
	}
}

class Car extends Vehicle {
	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	@Override
	void show() {
		System.out.printf("색 %s, 속도 %d, 배기량 %d, 기어수 %d", color, speed, displacement, gears);
	}
}
