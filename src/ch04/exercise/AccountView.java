package ch04.exercise;

public class AccountView {
	
	private static AccountView accountView;
	
	private AccountView() { }
	
	public static AccountView getAccountView() {
		if(accountView == null) return accountView = new AccountView();
		else return accountView;
	}
	
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

	public void accountListView(Account[] accounts) {
		int count = 0;
		for(Account ac : accounts) {
			if(count == 0 && ac == null) {
				System.out.println("조회된 계좌가 없습니다.");
				return;
			} else if(ac == null) {
				return;
			}
			
			System.out.println(ac.getAccountNumber() + "  " + ac.getAccountOwner() + "  " + ac.getHaveMoney());							
			
			count++;
		}
		
	}
}
