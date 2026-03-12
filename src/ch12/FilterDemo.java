package ch12;

import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		Stream.of("a1", "b1", "b2", "c1", "c2", "c3")
			.filter(s -> s.startsWith("c"))
			.skip(1) //몇개를 건너뛸지 c1 c2 c3가 나오는데 c1은 최종연산에 포함하지않음
			.forEach(System.out::println);
	}

}
