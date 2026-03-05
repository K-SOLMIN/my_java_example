package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		//정적배열을 이용해서 정해진 학생 수의 점수를 입력받아보자.
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<Integer>();
		int score;
		
//		System.out.print("학생의 점수를 입력하세요. 입력이 끝나면 -1 : ");
		
		System.out.println("ArrayList 크기 : " + scores.size());
		
		while(true) {
			System.out.print("학생의 점수를 입력하세요. 입력이 끝나면 -1 : ");
			score = in.nextInt();
			
			if(score == -1) break;
			
			scores.add(score);
		}
		
		System.out.println("add 후 ArrayList 크기 : " + scores.size());
//		for (int i = 0; i < scores.length; i++) {
//			System.out.print("점수를 입력하세요 : ");
//			scores[i] = in.nextInt();
//		}
//		
		int total = 0;
//		for (int i = 0; i < scores.size(); i++) {
//			total += scores.get(i);
//		}
		
		for(Integer varScore : scores) {
			total += varScore;
		}
		
		in.close();
		
		System.out.printf("%d명 학생의 점수 총합은 %d점 이고, 평균은 %.2f 입니다.", scores.size(), total, (double)total / scores.size());
//		
//		System.out.printf("%d 학생의 점수 총합은 %d점 이고, 평균은 %.2f 입니다.", numOfStudent, total, (double)total / numOfStudent);
		
	}
}
