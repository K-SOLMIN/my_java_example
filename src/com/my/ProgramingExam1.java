package com.my;

import java.util.Scanner;

public class ProgramingExam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choiceNum = 0;
		int userCash = 0;
		int enterPrice = 0;
		
		
		while(choiceNum != 4) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료");
			System.out.println("-------------------------------------");
			
			System.out.print("선택 > ");
			choiceNum = sc.nextInt();
			
			if(!(choiceNum >= 0 && choiceNum <= 4)) {
				System.out.println("1 - 4 번 사이의 숫자만 입력 가능합니다.");
				continue;
			}
			
			switch(choiceNum) {
				case 1 : {
					System.out.print("예금액 > ");
					enterPrice = sc.nextInt();
					if(enterPrice < 0) {
						System.out.println("금액은 0보다 작을 수 없습니다."); continue;
					} else {
						userCash += enterPrice;
					}
				} break;
				case 2 : {
					System.out.print("출금액 > ");
					enterPrice = sc.nextInt();
					if(enterPrice < 0) {
						System.out.println("금액은 0보다 작을 수 없습니다."); continue;
					} else {
						userCash -= enterPrice;
					}
				} break;
				case 3 : {
					System.out.print("잔고 > " + userCash);
				} break;
				case 4 : {
					System.out.print("프로그램 종료");
				} break;
			}
			
		}
		
		sc.close();
		
		
		
		
		
		
		
//		do {
//			
//			System.out.println("-------------------------------------");
//			System.out.println("1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료");
//			System.out.println("-------------------------------------");
//			
//			System.out.print("선택 > ");
//			choiceNum = sc.nextInt();
//			
//			if(!(choiceNum >= 0 && choiceNum <= 4)) {
//				System.out.println("1 - 4 번 사이의 숫자만 입력 가능합니다.");
//				continue;
//			}
//			
//			switch(choiceNum) {
//				case 1 : {
//					System.out.print("예금액 > ");
//					enterPrice = sc.nextInt();
//					if(enterPrice < 0) {
//						System.out.println("금액은 0보다 작을 수 없습니다."); continue;
//					} else {
//						userCash += enterPrice;
//					}
//				} break;
//				case 2 : {
//					System.out.print("출금액 > ");
//					enterPrice = sc.nextInt();
//					if(enterPrice < 0) {
//						System.out.println("금액은 0보다 작을 수 없습니다."); continue;
//					} else {
//						userCash -= enterPrice;
//					}
//				} break;
//				case 3 : {
//					System.out.print("잔고 > " + userCash);
//				} break;
//				case 4 : {
//					System.out.print("프로그램 종료");
//				} break;
//			}
//			
//			System.out.println();
//			
//		} while(choiceNum != 4);
//		
//		sc.close();
	}
}
