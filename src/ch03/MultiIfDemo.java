package ch03;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		//시험점수를 입력받아서 해당 점수가 A, B, C, F인지 학점을 출력해주는 프로그램을 작성하라.
		//A : 90 ~ 100, B : 80 ~ 89, C : 70 ~ 79, F : 0 ~ 69, 0 ~ 100범위를 벗어나는 점수가 들어오면 유효하지 않은 점수가 입력되었습니다.
		
		Scanner in = new Scanner(System.in);
		char grade = ' ';
		
		System.out.print("점수를 입력하세요 : ");
		int score = in.nextInt();
		
		//첫번재 조건문을 제외한 else if의 조건문들의 && 뒤의 비교연산은 무의미하다 0 ~ 100의 수가 들어왔을때만
		if(score >= 90 && score <= 100) {
//			String gr = "A"; if문 안의 변수이므로 밖에서 사용 x
			grade = 'A';
		} else if(80 >= score && score < 90) {
			grade = 'B';
		} else if(70 >= score && score < 80) {
			grade = 'C';
		} else if(0 > score && score < 70) {
			grade = 'F';
		} else {
			System.out.println("유효하지 않은 점수가 입력되었습니다.");
		}
		
		if(grade != ' ') System.out.printf("당신의 점수는 %d 이며, 학점은 %c 입니다.", score, grade);
		
//		if(score > 100 || score < 0) {
//			System.out.println("유효하지 않은 점수가 입력되었습니다.");
//		} else {
//			if(score >= 90) {
//				grade = 'A';
//			} else if(80 >= score) {
//				grade = 'B';
//			} else if(70 >= score) {
//				grade = 'C';
//			} else if(0 > score) {
//				grade = 'F';
//			} else {
//				System.out.println("유효하지 않은 점수가 입력되었습니다.");
//			}
//		}
//		
//		System.out.printf("당신의 점수는 %d 이며, 학점은 %c 입니다.", score, grade);
		
		
//		String strScore = "";
//		if(score > 100 || score < 0) {
//			System.out.println("유효하지 않은 점수가 입력되었습니다.");
//		} else {
//			if(score >= 90) { //nexted if 문 - 중첩 if문
//				if(score >= 95) {
//					strScore = "A+";
//				} else {
//					strScore = "A0";
//				}
//			} else if(80 >= score) {
//				grade = 'B';
//			} else if(70 >= score) {
//				grade = 'C';
//			} else if(0 > score) {
//				grade = 'F';
//			} else {
//				System.out.println("유효하지 않은 점수가 입력되었습니다.");
//			}
//		}
//		
//		System.out.printf("당신의 점수는 %d 이며, 학점은 %s 입니다.", score, strScore);
	}

}
