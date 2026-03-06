package ch07;

//abstract와 상수로만 구성되어있다.
public interface MyInterface {
	//상수
//	public static final int NUM = 10;
	int MIN = 1; //public static final 생략가능
	
	//추상메소드
	public abstract void sayHello();
	
	void sayHi(); //public abstract 생략가능
	
	default void talk() { }; //표준의 변경 v2
	
	default void sing() { }; //표준의 변경 v1
}


//interface 구현체 implements
class MyClass implements MyInterface {

	@Override
	public void sayHello() {
		System.out.println("hello");
	}

	@Override
	public void sayHi() {
		System.out.println("hi");
	}
	
}

class YourClass implements MyInterface {

	@Override
	public void sayHello() {
		System.out.println("hello");
	}

	@Override
	public void sayHi() {
		System.out.println("hi");
	}

	@Override
	public void talk() {
		System.out.println("talk");
	}
	
}
