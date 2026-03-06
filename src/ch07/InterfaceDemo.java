package ch07;

public class InterfaceDemo {
	public static void main(String[] args) {
		//인터페이스는 객체화 불가능
		//MyInterface m = new MyInterface();
		MyInterface m = new MyClass();
		m.sayHello();
		m.sayHi();
		
		YourClass y = new YourClass();
	}
}
