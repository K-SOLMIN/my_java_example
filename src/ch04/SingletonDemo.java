package ch04;

public class SingletonDemo {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); 싱글톤은 기본생성자로 생성 못하게 막음
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 + " : " + s2);
		System.out.println(s1 == s2);
	}
}
