package com.my.test;

public class AccountView {
	public void printManualViewHead() {
		String template = """ 
				  ------------------------------------------------
				  1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				  ------------------------------------------------
				  """;
		System.out.println(template);
	}
	
	public void printManualView(String manual) {
		System.out.println("---------");
		System.out.println(manual);
		System.out.println("---------");
	}
}
