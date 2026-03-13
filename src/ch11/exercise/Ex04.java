package ch11.exercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<>();
		ScoreController controller = new ScoreController();
		
		controller.FirstAction(scoreList);
		
//		int boolContinue = 0; //-1이면 종료
//		
//		while(boolContinue != -1) {
//			boolContinue = controller.enterScore(scoreList);
//		}
		
//		if(scoreList.size() == 0 || scoreList.isEmpty()) {
//			System.out.println("학생이 없습니다.");
//			return;
//		}
		
		System.out.println("전체 학생은 " + scoreList.size() + "명이다.");
		
		try {
			System.out.print("학생들의 성적 : ");
			scoreList.forEach(e -> System.out.print(e + " "));
			
			System.out.println();
			
			for(int i = 0; i < scoreList.size(); i++) {
				controller.printScore(i, scoreList.get(i));
			}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("학생점수를 먼저 등록하세요");
		} finally {
			controller.FirstAction(scoreList);
		}
	}
	
}


class ScoreController {
	public void FirstAction(List<Integer> scoreList) {
//		scoreList = new ArrayList<>();
		ScoreController controller = new ScoreController();
		int boolContinue = 0; //-1이면 종료
		
		while(boolContinue != -1) {
			boolContinue = controller.enterScore(scoreList);
		}
	}
	
	public int enterScore(List<Integer> scoreList) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			try {
				System.out.print("점수를 입력하세요 : ");
				score = sc.nextInt();
				
				if(score > 100) {
					System.out.println("점수는 100을 넘을 수 없음..");
					continue;
				}
			} catch(InputMismatchException e) {
				System.out.println("숫자!!");
				return 1;
			}
			
			sc.nextLine();
			
			if(score < 0) return -1;
			
			scoreList.add(score);
		}
		
	}
	
	public void printScore(int index, int score) {
		String grade = "";
		
		if(score >= 90) grade = "A";
		else if(score >= 80) grade = "B";
		else grade = "C";
		
		//0번 학생의 성적은 00점이며 등급은0이다.
		System.out.printf("%d번 학생의 성적은 %d점이며 등급은%s이다.\n", index, score, grade);
	}
}


