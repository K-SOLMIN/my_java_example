package ch08;

public class KeyboardDemo {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("logitech");
		Mouse m2 = new Mouse("logitech");
		
		System.out.println(" ==(none @override equals) :  " + (m1 == m2));
		System.out.println("@Override equals : " + m1.equals(m2));
		
		Keyboard k1 = new Keyboard("logitech");
		Keyboard k2 = k1;
		
		System.out.println(" == : " + (k1 == k2));
		System.out.println("Override equals : " + k1.equals(k2));
		
		if(k1.equals(k2)) {
			System.out.println(k1 + "keyboard입니다.");
		} else {
			System.out.println("서로 다른 키보드 입니다.");
		}
	}

}

class Keyboard {
	String name;

	public Keyboard(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(obj instanceof Keyboard k) {
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
