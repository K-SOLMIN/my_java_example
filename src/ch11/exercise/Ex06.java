package ch11.exercise;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		Set<Integer> randomNum = new HashSet<>();
		
		while(true) {
			randomNum.add(new Random().nextInt(45) + 1);
			if(randomNum.size() > 6) break;
		}
		
		randomNum.stream().sorted().limit(6).forEach(num -> System.out.print(num + " "));
	}
}
