package ch04.exercise;

import java.util.Scanner;
import static ch04.exercise.AccountView.getAccountView;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";
		int createAccountCount = 0; //계좌생성횟수 카운트
		//int money = 0;
		Account account = new Account();
		AccountAction action = new Account();
		Account[] accounts = new Account[2];
		
		while(true) {
			getAccountView().printManualViewHead();
			System.out.print("선택 > ");
			menu = sc.nextLine();
			
			if(menu.equals("5")) break;
			
			switch(menu) {
				case "1" -> {
					account = account.generateAccount(sc);
					
					if(account == null) System.out.println("20억 이상은 입금이 불가합니다.");
					else accounts[createAccountCount] = account;
						
					createAccountCount++;
				}
				case "2" -> action.accountInquiry(accounts);
				case "3" -> action.depostio(0);
				case "4" -> action.withdraw(0);
				default -> System.out.println("메뉴확인요함");
			}
		}
		
		System.out.println("종료");
	}

}


