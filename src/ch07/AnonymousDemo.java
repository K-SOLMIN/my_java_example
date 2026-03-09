package ch07;

public class AnonymousDemo {

	public static void main(String[] args) {
		Parent parent = new Parent() {
			
			
			@Override
			void method1() {
				System.out.println("한번만 만들어져서 불리는 익명클래스");
			}
		};
		
		parent.method1();
		
		ParentInterface pi = new ParentInterface() {
			
			@Override
			public void method2() {
				System.out.println("부모 인터페이스를 구현한 자식 클래스");
			}
		};
		
		pi.method2();
	}

}

class Parent {
//	class 이름없음 extends Parent {
//		한번만 사용되는 익명클래스
//	}
	
	String parentField = "parent field";
	
	void method1() {
		System.out.println("call method1");
	}
}

class OnlyOnce extends Parent {
	
}

interface ParentInterface {
	void method2();
}

//class Once implements ParentInterface {
//	
//	@Override
//	public void method2() {
//		System.out.println("@Override parentInterface method");
//	}
//	
//}
