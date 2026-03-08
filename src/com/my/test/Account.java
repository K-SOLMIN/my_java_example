package com.my.test;

import java.util.Scanner;

public class Account{	
		public void accountManualView() {
			String template = """ 
					  ------------------------------------------------
					  1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
					  ------------------------------------------------
					  """;
			System.out.println(template);
		}
		
		public Account generateAccount(Scanner sc) {
			return this;
		}
		
		public boolean depostio(int money) {
			return true;
		}
}
