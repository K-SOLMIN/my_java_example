package com.my;

import java.util.Scanner;

public class RandomDiceUserRequest {
	//몇번 돌릴지 물어보고 1 ~ 6의 랜덤수 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userCount = 0;
		int randomNum = 0;
		
		System.out.print("돌릴횟수 입력 : ");
		userCount = sc.nextInt();
		
		for(int i = 0; i < userCount; i++) {
			randomNum = (int) (Math.random() * 2);
			System.out.printf("실행 %d : %d\n", i + 1, randomNum);
		}
		
		sc.close();
		
	}
}
