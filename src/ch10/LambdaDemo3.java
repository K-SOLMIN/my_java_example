package ch10;

import java.util.function.Predicate;

public class LambdaDemo3 {

	public static void main(String[] args) {
		//람다
		MyFunction f = () -> System.out.println("익명객체입니다.");
		//원래방식
//		new MyFunction() {
//			@Override
//			public void myMethod() {
//				System.out.println("익명 객체입니다.");
//			}
//		};
		
		aMethod(f);
		
		f = bMethod();
		f.myMethod();
		
		Predicate<String> isEmpty = str -> str.length() == 0;
		
		System.out.println(isEmpty.test(""));

	}
	
	static void aMethod(MyFunction f) {
		f.myMethod();
	}
	
	static MyFunction bMethod() {
		return () -> System.out.println("return 람다식");
	}

}

@FunctionalInterface
interface MyFunction {
	
	void myMethod();
}
