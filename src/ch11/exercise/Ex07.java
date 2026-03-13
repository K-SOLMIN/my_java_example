package ch11.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		Map<String, Integer> map = new HashMap<>();
		String maxName = ""; // 최고 점수를 받은 아이디를 저장하는 변수
		String minName = ""; // 최저 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int minScore = 100; // 최저 점수를 저장하는 변수
		long totalScore = 0L; // 점수 합계를 저장하는 변수
		double mean = 0.0; // 평균 점수를 저장하는 변수
		
		for (int i = 0; i < 1000000; i++) {
            map.put("user" + i, (int)(Math.random() * 101)); // 0~100 점수
        }
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		Map.Entry<String, Integer> element;
		
		while(it.hasNext()) {
			element = it.next();
			
			if(maxScore < element.getValue()) {
				maxScore = element.getValue();
				maxName = element.getKey() + " ";
			}
			
			if(minScore > element.getValue()) {
				minScore = element.getValue();
				minName = element.getKey();
			}
			
			totalScore += element.getValue();
		}
		
		
		mean = (double) totalScore / entrySet.size();
		System.out.println("총합 : " + totalScore + " 평균 : " + mean);
		System.out.println("최고점학생 : " + maxName + " 점수 = " + maxScore);
		System.out.println("최저점학생 : " + minName + " 점수 = " + minScore);
		
		long end = System.nanoTime();
		
		System.out.println("걸린시간 : " + (end - start));
	}

}
