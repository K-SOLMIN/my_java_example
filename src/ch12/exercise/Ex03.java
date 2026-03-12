package ch12.exercise;

import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List.of("갈매기", "나비", "다람쥐", "라마")
			.stream()
			.filter(fly -> fly.length() == 2)
			.forEach(System.out::println);
											
	}

}
