package ch05;

public class ArrayIncrementDemo {

	public static void main(String[] args) {
		int[] x = {0, 1, 2};
		
		System.out.println("호출전 x[0] : " +x[0]);
		
		change(x);
		
		System.out.println("호출후 x[0] : " +x[0]);
	}
	
	public static void change(int[] x) {
		System.out.println("변경전 x[0] : " +x[0]);
		x[0]++;
		System.out.println("변경후 x[0] : " +x[0]);
	}

}
