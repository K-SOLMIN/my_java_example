package ch05;

public class StringPoolDemo {
	public static void main(String[] args) {
		//최적화전
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		str1 = str2;
		str2 = "hello2";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1);
		System.out.println(str2);
		
		//최적화 후 (String객체를 만들면서 만든 객체의 값이 string pool에 존재하는지 찾아보고 존재하면 존재하는 객체의 값을 반환하고 없다면 새로 만든다.
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1 == s2);
	}
}

