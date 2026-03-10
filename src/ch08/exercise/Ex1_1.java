package ch08.exercise;

import java.util.Objects;

public class Ex1_1 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		
		if(c1.equals(c2)) System.out.println("c1 과 c2는 같다.");
		else System.out.println("c1과 c2는 다르다.");
	}

}

class Circle {
	int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}

}
