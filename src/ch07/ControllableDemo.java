package ch07;

public class ControllableDemo {

	public static void main(String[] args) {
		/*
		 * 예를 들어, 전자제품에 포함되어야 하는 제어부의 요구 조건
		 * 모든 전자제품에는 전원을 온.오프하는 기능이 있으며, 수리 및 공장 초기화를 할
		 * 수 있다. 전자제품 객체는 turnOn() 메소드, turnOff() 메소드로만 전원을 조절할 수 있어야 한다. 수리 및 공장 초기화
		 * 기능을 미리 구현해 놓아서 필요할 때 사용할 수 있어야 한다. 수리기능은 자식 클래스에서 오버라이딩 할 수도 있다.
		 */
		
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		tv.remoteOff();
		tv.remoteOn();

		Controllable.reset1();
		
		NoteBook no = new NoteBook();
		no.turnOn();
		no.turnOff();
		no.inMyBag();
		no.repair();
		
//		Computer noteBook = new NoteBook();
//		noteBook.turnOn();
//		noteBook.turnOff();
//		((NoteBook) noteBook).inMyBag(); //??
		
	}

}

interface Controllable {
	void turnOn();
	
	void turnOff();
	
	//구현부는 static/ private/ default 로 선언된 메소드는 구현부가 있다.
	//Override 대상은 default로 선언된 메소드만이다.
	//static은 필요할때 불러다 쓸 수 있다.
	default void repair() {
		System.out.println("repair");
//		reset();
	}
	
	private void reset() {
		
	}
	
	static void reset1() {
		System.out.println("interface static method reset1");
	}
}

interface RemoteControllable extends Controllable{
	void remoteOn();
	
	void remoteOff();
}

class TV implements Controllable, RemoteControllable {

	@Override
	public void turnOn() {
		System.out.println("tv를 켜다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끄다.");
	}

	@Override
	public void repair() {
		System.out.println("tv를 수리한다.");
	}

	@Override
	public void remoteOn() {
		System.out.println("remoteOn");
	}

	@Override
	public void remoteOff() {
		System.out.println("remoteOff");
		
	}
	
}

class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("turnOff");
	}
	
}

interface Portable {
	void inMyBag();
}

class NoteBook extends Computer implements Portable{

	@Override
	public void inMyBag() {
		System.out.println("in my bag");
	}
	
}
