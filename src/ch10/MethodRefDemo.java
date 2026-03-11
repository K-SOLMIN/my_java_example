package ch10;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodRefDemo {

	public static void main(String[] args) {
//		Mathematical math = dNum -> Math.abs(dNum);
		Mathematical math = Math::abs; //static method 참조 람다식 축약
		System.out.println(math.calculate(-10.0));
		
//		Pickable p = (str, i) -> str.charAt(i);
		Pickable p = String::charAt; //인스턴스 메소드 참조
		System.out.println(p.pick("hello", 0));
		
		Utils util = new Utils();
//		System.out.println(util.add(10, 20));
		
//		Computable com = (num1, num2) -> util.add(num1, num2);
		Computable com = util::add;
		com.compute(10, 20);
		
//		Consumer<String> c = s -> System.out.println(s);
		String[] strArr = {"에라이", "이게", "뭐냐"};
		Consumer<String> c = System.out::println;
		c.accept(Arrays.toString(strArr));
		
//		NewObject<String> newObj = str -> new String(str);
		NewObject<String> newObj = String::new;
		
	}

}

@FunctionalInterface
interface Mathematical {
	double calculate(double d);
}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface NewObject<T> {
	T getObject(T o);
}