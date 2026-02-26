package ch02;

public class VarScopeDemo {

	//주석처리한 변수들은 스코프에의해 사용할 수 없다.
	public static void main(String[] args) {
		int var1 = 10;
		
		if(true) {
			int var2 = 20;
			System.out.println("var 1 : " + var1);
			System.out.println("var 2 : " + var2);
//			System.out.println("var 3 : " + var3);
		}
		
		for(int i = 0; i < 1; i++) {
			int var3 = 30;
			System.out.println("var 1 : " + var1);
//			System.out.println("var 2 : " + var2);
			System.out.println("var 3 : " + var3);
		}
		
		System.out.println("var 1 : " + var1);
//		System.out.println("var 2 : " + var2);
//		System.out.println("var 2 : " + var3);
	}

}
