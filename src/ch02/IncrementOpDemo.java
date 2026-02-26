package ch02;

public class IncrementOpDemo {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		//단독사용은 후위냐 전위냐의 차이가 없다.
		x++; // x = 0; x = x + 1;
		++y; // y = y + 1
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x++);
		System.out.println(++y);
		
		System.err.println("x = " + x);
		System.out.println("y = " + y);
	}

}
