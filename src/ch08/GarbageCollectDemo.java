package ch08;

public class GarbageCollectDemo {

	public static void main(String[] args) {
		new Garbage(0);
		System.gc();
		System.out.println("");
		
//		for(int i = 0; i < 3; i++) {
//			new Garbage(i);
//			System.gc();
//		}
	}

}

class Garbage {
	//필드
	int number;
	
	//생성자
	public Garbage(int number) {
		this.number = number;
		System.out.printf("Garbage(%d) 생성됨 \n", number);
	}
	
	//소멸자
	//객체가 소멸될 때 자동으로 호출되는 메서드
	@Override
	protected void finalize() {
		System.out.printf("Garbage(%d) 수거됨 \n", number);
	}
}