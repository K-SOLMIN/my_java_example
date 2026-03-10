package ch09;

public class CheckedDemo {
	public static void main(String[] args) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("checked exception generate");
		}
		
		System.out.println("exception not generate");
		
	}
}
