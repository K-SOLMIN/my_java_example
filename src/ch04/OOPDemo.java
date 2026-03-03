package ch04;

public class OOPDemo {
	
	public static void main(String[] args) {
		//상속 전의 코드는 반복이 있음 (변수, 반복문, 메소드, 상속)
		//상속을 통해 반복을 없애보자. 수정을 부모쪽에서만 하면 자식도 같이 수정된다. 즉 유지보수성이 높아졌다.
		
//		Animal animal = new Animal();
//		animal.eat();
//		animal.move();
		
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.move();
		tiger.name = "호랑이";
		System.out.println("변수 초기화");
		tiger.move();
		tiger.eat();
		
		Fish fish = new Fish();
		fish.eat();
		fish.move();
		
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.move();
	}
}

abstract class Animal {
	String name = "동물";
	
	void eat() {
		System.out.println(name + "은 먹습니다.");
	}
	
	//추상화
	abstract void move();
	
}

//상속받은 클래스는 부모의 기능(메소드) 사용 가능
class Tiger extends Animal {
	//Tiger 의 변수, 변수는 오버라이딩 대상이 아니다.
	String name = "호랑이"; 
	
	//메서드는 오버라이딩 대상이다.
	@Override
	void move() {
		System.out.println("super : " + super.name);
		System.out.println("this : " + this.name);
		System.out.println(name + "는 달립니다.");
	}
}

class Eagle extends Animal {
	String name = "독수리";
	
	@Override
	void move() {
		System.out.println(name + "는 날아갑니다.");
	}
}

class Fish extends Animal {
	String name = "물고기";
	
	@Override
	void move() {
		System.out.println(name + "는 헤엄칩니다.");
	}
}
