package ch07.exercise;

public class Ex02 {
//	실행결과 (밑변과 높이가 10,10인 삼각형 t1 과 밑변과 높이가 5,10인 삼각형 t2가 주어졌을 경우)
//	삼각형 [width = 10, height = 10, 넓이 = 50] 이 더 큽니다.
	public static void main(String[] args) {
		Triangle t1 = new Triangle(6, 10);
		Triangle t2 = new Triangle(5, 10);
		
		if(t1.compareTo(t2) > 0) System.out.println(t1 + "이 더큽니다.");
		else if(t1.compareTo(t2) == 0) System.out.println("같습니다.");
		else if(t1.compareTo(t2) < 0) System.out.println(t2 + "이 더큽니다.");
		else if(t1.compareTo(t2) == -99) System.out.println("0은 안돼요, null도 안돼요");
		
	}
}

class Triangle implements Comparable<Triangle>{
	private int width;
	private int height;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		if(width == 0 || height == 0) return 0;
		else return (int) ((width + height) * ((double) 1 / 2));
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Triangle t) {
		if(t == null || getArea() == 0 || t.getArea() == 0) return -99;
		
		return getArea() - t.getArea();
	}
	
	
}