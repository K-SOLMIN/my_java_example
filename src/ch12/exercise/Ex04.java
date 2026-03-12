package ch12.exercise;

import java.util.Comparator;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		//Optional<String> oi = 
		List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던")
							.stream()
							.sorted(Comparator.comparing(str -> str))
							.findFirst()
							.ifPresent(System.out::println);
//		oi.ifPresent(System.out::println);
	}
}
