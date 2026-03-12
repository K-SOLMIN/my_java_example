package ch12.exercise;

import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		//3
		Stream.of("a1", "a2", "a3")
					.map(s -> s.substring(1))
					.mapToInt(Integer::parseInt)
					.max()
					.ifPresent(System.out::println);
	}
}
