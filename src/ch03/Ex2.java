package ch03;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		//9 9단 만들기
		//계속 입력받을수있도록 -1을입력받으면 종료
		Scanner sc = new Scanner(System.in);
//		System.out.print("출력할 단수(1 ~ 9)를 입력하세요 : ");
		int wantNum = 0;
		
		while(wantNum != -1) {
			System.out.print("출력할 단수(1 ~ 9)를 입력하세요 : ");
			wantNum = sc.nextInt();
			
			if(wantNum == -1) break;
			
			if(wantNum > 0 && wantNum < 10) {
				for(int i = 0; i < 9; i++) {
					System.out.printf("%d X %d = %d\n", wantNum, i + 1, wantNum * (i + 1));
				}
			} else {
				System.out.println("1~9를 입력하세요");
			}			
		}
		sc.close();
		
		System.out.println("종료");
	}
}
