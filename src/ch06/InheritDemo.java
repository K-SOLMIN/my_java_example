package ch06;

public class InheritDemo {
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.eat();
		
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		
		GoldFish fish = new GoldFish(); 
		fish.swim();
		fish.eat();
	}
	
	
}

class Animal {
	//공통되는 필드
	String eyes;
	String mouth;
	
	//공통되는 메소드
	void eat() { 
		System.out.println("먹는다.");
	}
	
	
	void sleep() {  
		System.out.println("잔다.");
	}
}

class Eagle extends Animal {
	//자식에게만 있는 필드
	String wings;
	
	//자식에게만 있는 메소드
	void fly() {
		System.out.println("날다");
	}

	@Override
	public String toString() {
		return "Eagle Override toString()";
	}
	
}

//다중상속 불가(부모가 2일 순 없다.)
class Tiger extends Animal{
	//자식에게만 있는 필드
	String legs;
	
	//자식에게만 있는 메소드
	void run() {
		System.out.println("달린다");
	}
}

class GoldFish extends Animal {
	//자식에게만 있는 필드
	String fins;
	
	//자식에게만 있는 메소드
	void swim() {
		System.out.println("헤엄치다");
	}
}
