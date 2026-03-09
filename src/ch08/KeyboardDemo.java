package ch08;

import java.util.Objects;

public class KeyboardDemo {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("logitech");
		Mouse m2 = new Mouse("logitech");
		
//		System.out.println(" ==(none @override equals) :  " + (m1 == m2));
//		System.out.println("@Override equals : " + m1.equals(m2));
//		
//		Keyboard k1 = new Keyboard("logitech");
//		Keyboard k2 = k1;
//		
//		System.out.println(" == : " + (k1 == k2));
//		System.out.println("Override equals : " + k1.equals(k2));
		
		Keyboard k1 = new Keyboard("logitec", "L001", 10000);
		Keyboard k2 = new Keyboard("logitec", "L002", 12000);
		
		if(k1.equals(k2)) {
			System.out.println(k1 + "keyboard입니다.");
		} else {
			System.out.println("서로 다른 키보드 입니다.");
		}
	}

}

class Keyboard {
	String name; //제조사
	String model; //모델
	int price; //금액
	String f1;
	String f2;
	String f3;
	String f4;
	String f5;
	String f6;
	String f7;
	String f8;
	String f9;

	public Keyboard(String name) {
		this.name = name;
	}

	public Keyboard(String name, String model, int price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(obj instanceof Keyboard k) {
//			if(this.name.equals(k.name) && 
//					this.model.equals(k.model) && this.price == k.price) {
//			}
			System.out.println(this.hashCode() + " : " + k.hashCode());
			if(this.hashCode() == k.hashCode()) return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, model, price);
//		return Objects.hash(name, model, f1, f2, f3, f4, f5, f6, f7, f8, f9);
	}

	@Override
	public String toString() {
		return this.name;
	}
}

class Mouse {
	//변수
	String name;
	
	//생성자
	public Mouse(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(obj instanceof Mouse k) {
			if(this.name.equals(k.name)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
