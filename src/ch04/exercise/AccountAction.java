package ch04.exercise;

import java.util.Scanner;

public interface AccountAction {
	Account generateAccount(Scanner sc);
	
	boolean depostio(int money);
	
	void withdraw(int money);
	
	int accountInquiry(Account[] accounts);
}
