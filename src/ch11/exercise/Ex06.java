package ch11.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		Set<Integer> randomNum = new HashSet<>();
		Random random = new Random();
		
		while(true) {
			randomNum.add(random.nextInt(45) + 1);
			if(randomNum.size() > 6) break;
		}
		
//		List<Integer> ranNumList = Arrays.asList(randomNum.toArray(new Integer[randomNum.size()]));
		
		Integer[] ranNumArr = randomNum.toArray(new Integer[randomNum.size()]);
		
		List<Integer> ranNumList = Arrays.asList(ranNumArr);
		
		Collections.sort(ranNumList);
		
		ranNumList.forEach(num -> System.out.print(num + " "));
	}
}

//randomNum.stream().sorted().forEach(num -> System.out.print(num + " "));