package ch04.exercise;

import java.util.Scanner;
import static ch04.exercise.AccountView.getAccountView;

public class Account implements AccountAction{
	//비지니스 도메인의 비지니스 로직, 롤 정의되어 있어야 함.
		private String accountNumber;
		private String accountOwner;
		private int balance;
		
		public Account() {
			// TODO Auto-generated constructor stub
		}
		
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
		
		@Override
		public Account generateAccount(Scanner sc) {
			String accountNumber;
			String accountOwner;
			int balance;
			
			getAccountView().printManualView("계좌생성");
			System.out.print("계좌번호 : ");
			accountNumber = sc.nextLine();
			
			System.out.print("계좌 주인명 : ");
			accountOwner = sc.nextLine();
			
			sc.nextLine();
			
			System.out.println("초기 입금액 : ");
			balance = sc.nextInt();
			
			if(balance > 2_000_000_000) {
				return null;
			} else {
				return new Account(accountNumber, accountOwner, balance);				
			}
		}
		
		@Override
		public boolean depostio(int money) {
			//overflow고려
			getAccountView().printManualView("입금");
			
			long total = balance + money;
			if(total <= 2_000_000_000) {
				balance += money;
				return true;
			} else {
				return false;
			}
		}
		
		@Override
		public void withdraw(int money) {
			getAccountView().printManualView("출금");
			
			if(balance >= money)
				balance -= money;
		}
		
		@Override
		public int accountInquiry(Account[] accounts) {
			getAccountView().printManualView("계좌목록");
			
			getAccountView().accountListView(accounts);
			return balance;
		}
}
