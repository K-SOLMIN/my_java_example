package ch11.exercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RefacEx07 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		String maxName = ""; // 최고 점수를 받은 아이디를 저장하는 변수
		String minName = ""; // 최저 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int minScore = 100; // 최저 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
		double mean = 0.0; // 평균 점수를 저장하는 변수
		
		for (int i = 0; i < 100000; i++) {
            map.put("user" + i, (int)(Math.random() * 101)); // 0~100 점수
        }
		
		long start = System.nanoTime();
		
		Collection<Integer> scores = map.values();
		int[] scoreArr = new int[scores.size()];
		int index = 0;
		
		for(Integer score : scores) {
			scoreArr[index] = score;
			totalScore += score;
			index++;
		}
		
		Arrays.sort(scoreArr);
		
		mean = (double) totalScore / scores.size();
		maxScore = scoreArr[scoreArr.length - 1];
		minScore = scoreArr[0];
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		Map.Entry<String, Integer> element;
		
		while(it.hasNext()) {
			element = it.next();
			
			if(element.getValue() == maxScore) maxName += element.getKey() + " ";
			else if(element.getValue() == minScore) minName += element.getKey() + " ";
		}
		
		System.out.printf("종합 : %d, 평균 : %.2f\n", totalScore, mean);
		System.out.println("최고점학생 : " + maxName + " 점수 = " + maxScore);
		System.out.println("최저점학생 : " + minName + " 점수 = " + minScore);
		
		long end = System.nanoTime();
		
		System.out.println("걸린시간 : " + (end - start));
	}
}
