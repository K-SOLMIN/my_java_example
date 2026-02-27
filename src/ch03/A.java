package ch03;

public class A {

	public static void main(String[] args) {
//		B b = new B();
//		System.out.println(b.sum());
		
		MyMath math = new MyMath();
		System.out.println(math.add(10L, 20L));
		System.out.println(math.sub(10L, 20L));
	}
    
}

//접근제한자 default는 같은 패키지 내에서 객체 생성가능
//클래스 접근제한자가 default일때 그 클래스 내부에 static으로 선언된 메소드, 변수는 다른 패키지에서는 사용이 불가능하다
//class B {
//	int sum() {
//		int total = 1 + 2 + 3;
//		return total;
//	}
//}

class MyMath {
	long add(long a, long b) {
//		long sum = a + b;
//		return sum;
		
		return a + b;
	}
	
	long sub(long a, long b) {
		return a - b;
	}
}
