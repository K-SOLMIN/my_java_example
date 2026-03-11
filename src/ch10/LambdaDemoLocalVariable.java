package ch10;

public class LambdaDemoLocalVariable {

	public static void main(String[] args) {
		String s = "hello";
		String x = "hi";
		
//		UseThis u = () -> System.out.println("useThis 람다식 구현체입니다.");
		//지역변수 람다식 내부에서 쓸 수 없음; error msg = cannot redeclare another local variable defined
//		UseThis u = (s) -> System.out.println(s + "useThis 람다식 구현체입니다."); (X)
		UseThis u = (str) -> System.out.println(str + "useThis 람다식 구현체입니다.");
		
		u.use(null);
		
		int count = 0;
		UseThis ut = (str) -> {
//			Local variable count defined in an enclosing scope must be final or effectively final 안됨
//			count = 1; (X)
			System.out.println(str + "useThis 람다식 구현체입니다.");
//			System.out.println(count); 이건되네? 외부 변수를 쓸 수는 있지만 재할당은 불가능하다.
		};
		
		ut.use(";;");
	}

}

@FunctionalInterface
interface UseThis {
	void use(String str);
}
