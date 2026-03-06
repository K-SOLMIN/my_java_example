package ch06.exercise;

public class Ex04 {

	public static void main(String[] args) {
		//의도 (필드는 오버라이딩 되지 않는다.)
		//p.name 했을때 p의 실제 객체는 child 이기때문에 사도세자가 나올거같다
		//하지만 필드 -> 참조타입 기준으로 결정되고 / 메소드 -> 실제 객체 기준으로 결정된다
		//실제 p.name은 (참조타입 기준) Parent.name 이 되는거고 void print() 부분은 (실제객체 기준) Child.print()가 된다 오버라이딩.
		//--------- 부가설명 -----------
		// 필드는 컴파일 시점에 결정되고 그래서 참조타입
		// 객체는 런타임 시점에 실제 객체 타입을 보고 결정(동적바인딩)
		//메모리 ------------------------------------------------------
		//child(객체)
		//	필드 -- Parent.name = "영조" -> 얘가 참조타입기준(p.name)
		//      -- Child.name  = "사도세자"
		// 메소드 -- Child.print() -> 얘가 실제 객체 기준 (void print())
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}

}

class Parent {
	String name = "영조";
	
	void print() {
		System.out.println(name);
	}
}

class Child extends Parent {
	String name = "사도세자";
	
	void print() {
		System.out.println(name);
	}
}
