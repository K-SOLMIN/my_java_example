package ch10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo4 {

	public static void main(String[] args) {
		
		Runnable run = () -> System.out.println("runnable 구현체 입니다.");
		Consumer<String> consume = System.out::println; // ==> (element) -> System.out.println("consumer 구현체 입니다.");
		Supplier<String> sup = () -> "supplier hello";
		Function<String, Integer> func = (element) -> element.replaceAll(" ", "").length();
		
		run.run();
		
		consume.accept("consumer hello");
		
		System.out.println(sup.get());
		
		System.out.println("'function hello'는 " + func.apply("function hello") + "글자 입니다.");
	}

}

//@FunctionalInterface
//public interface Runnable {
//	public abstract void run();
//}

