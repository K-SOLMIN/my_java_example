package ch11.exercise;

import java.util.HashMap;
import java.util.Map;

public class ReReFac07 {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 100000; i++) {
            map.put("user" + i, (int)(Math.random() * 101)); // 0~100 점수
        }

        long start = System.nanoTime();
        
        int totalScore = 0;
        int maxScore = 0;
        int minScore = 100;

        String maxName = "";
        String minName = "";

        for (Map.Entry<String, Integer> e : map.entrySet()) {

            int score = e.getValue();
            String name = e.getKey();

            totalScore += score;

            if (score > maxScore) {
                maxScore = score;
                maxName = name + " ";
            } else if (score == maxScore) {
                maxName += name + " ";
            }

            if (score < minScore) {
                minScore = score;
                minName = name + " ";
            } else if (score == minScore) {
                minName += name + " ";
            }
        }

        double mean = (double) totalScore / map.size();

        System.out.printf("종합 : %d, 평균 : %.2f\n", totalScore, mean);
        System.out.println("최고점학생 : " + maxName + " 점수 = " + maxScore);
        System.out.println("최저점학생 : " + minName + " 점수 = " + minScore);

        long end = System.nanoTime();
        System.out.println("걸린시간 : " + (end - start));
    }
}
