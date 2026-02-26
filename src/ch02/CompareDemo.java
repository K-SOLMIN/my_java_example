package ch02;

public class CompareDemo {

	public static void main(String[] args) {
		//참조타입 비교
		String str1 = "hello";
		String str2 = "hello";
		String str5 = "HELLO";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		String str6 = new String("HELLO");
		
		System.out.println(str1 == str2); //true String Pool
		System.out.println(str3 == str4); //false
		
		System.out.println(str3.equals(str4)); //true
		System.out.println(str5.equalsIgnoreCase(str6)); //대소비교 무시 메소드 true
		
		//기초타입 비교
		
	}

}
