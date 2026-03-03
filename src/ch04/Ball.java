package ch04;

public class Ball {
	private double radius = 10;
	private final double PI = 3.14;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		if(radius > 0) this.radius = radius;
	}
	
	public double getVolume() {
		return (double) 4 / 3 * PI * radius * radius * radius;
	}
}
