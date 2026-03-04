package ch04;

public class Singleton {
	//static변수
	private static Singleton singleton = new Singleton();
	
	//외부에서 객체를 생성할 수 없어야한다. (내부에서 생성)
	private Singleton() { }
	
	//객체에 대한 접근을 허용해줘야한다.
	public static Singleton getInstance() {
		return singleton;
	}
}
