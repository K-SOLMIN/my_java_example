package ch04.exercise;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";
		int money = 0;
		Account account = null;
		Account[] accountArr;
		String template = """ 
						  ------------------------------------------------
						  1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
						  ------------------------------------------------
						  """;
		
		while(true) {
			//			System.out.println("------------------------------------------------");
			//			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			//			System.out.println("------------------------------------------------");
			System.out.println(template);
			System.out.print("선택 > ");
			menu = sc.nextLine();
			
			if(menu.equals("5")) break;
			
			switch(menu) {
				case "1" -> System.out.println("생성");
				case "2" -> System.out.println("조회");
				case "3" -> System.out.println("예금");
				case "4" -> System.out.println("출금");
				default -> System.out.println("메뉴확인요함");
			}
		}
		
		System.out.println("종료");
	}

}

class Account {
	//비지니스 도메인의 비지니스 로직, 롤 정의되어 있어야 함.
	private String accountNumber;
	private String accountOwner;
	private int balance;

	public Account(String accountNumber, String accountOwner, int haveMoney) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = haveMoney;
	}
	
	//계좌번호는 한번 생성되면 바뀔일이 없으므로 setter는 뺌
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public int getHaveMoney() {
		return balance;
	}
	
	//메소드 (입금, 출금, 조회)
	//입금
	
	public void generateAccount(Scanner sc, Account account) {
		printManualView("계좌생성");
		
		System.out.println("계좌번호 : ");
		
	}
	
	public boolean depostio(int money) {
		//overflow고려
		printManualView("입금");
		
		long total = balance + money;
		if(total <= 2_000_000_000) {
			balance += money;
			return true;
		} else {
			return false;
		}
	}
	
	public void withdraw(int money) {
		printManualView("출금");
		
		if(balance >= money)
			balance -= money;
	}
	
	public int accountInquiry() {
		printManualView("조회");
		
		return balance;
	}
	
	private void printManualView(String manual) {
		System.out.println("---------");
		System.out.println(manual);
		System.out.println("---------");
	}
}

