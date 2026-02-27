package ch03;

public class MethodCallDemo {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment 메서드 시작할 때 n의 값은 " + x);
		increment(x);
		System.out.println("increment 메서드 종료할 때 n의 값은 " + x);
	}
	
	//매개변수로 x를넣으면 x라는 변수가 들어가는 값이 아니라
	//매개변수로 넣을때 값을 복사해서 넣기때문에 main메서드 안의 x의값은 변하지 않는다.
	public static void increment(int x) { //call by value -- readonly
		System.out.println("increment 메서드 시작할 때 n의 값은 " + x);
		x++;
		System.out.println("increment 메서드 종료할 때 n의 값은 " + x);
	}

}
