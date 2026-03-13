package com.my.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaryRambdaTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 ㄱㄴ");
				sc.nextLine();
			}
		}
	}
}

class OuterClass2 {
	
	
}

//interface OuterInterface {
//	void force();
//	
//	class Once {
//		@Override
//		public void force() {
//			System.out.println("extends");
//		}
//	}
//}
