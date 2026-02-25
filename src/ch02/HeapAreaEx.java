package ch02;

public class HeapAreaEx {

	public static void main(String[] args) {
		String str = "Hello"; // 'h' 'e' 'l' 'l' 'o'
		
		//1. 4바이트 확보
		//2. 힙 영역에 Object객체 생성
		//3. 주소를 1번에 확보한 변수에 할당
		Object obj = new Object();
		
		//1. 4바이트확보
		//2. 3 이라는 값을 1번에 확보한 변수에 할당
		int value = 3;
		
		//1. 4바이트 확보
		//2. 힙 영역에 Object객체 생성
		//3. 주소를 1번에 확보한 변수에 할당
		String str1 = new String("Hello");
		
		System.out.println(str);
		System.out.println(obj);
	}

}
