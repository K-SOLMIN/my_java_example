package ch02;

public class OperatorDemo {
	public static void main(String[] args) {
		//오버플로우 발생을 막기위해 피연산자중 하나를 타입 변환 했음
		int i = 1_000_000;
		int j = 2_000_000;
		
		long result = (long) i * j;
		System.out.println(result);
	}
}
