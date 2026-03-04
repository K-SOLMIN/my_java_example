package ch05;

public class StringMethodDemo {

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "JAVA";
		String s3 = "hello";
		
		System.out.println("s1의 문자열 길이는 ? " + s1.length());
		System.out.println("s2의 2index(3번째)에 있는 문자 : " + s2.charAt(2));
		System.out.println("전부 대문자로 바꾸기 : " + s2.toUpperCase() + " : " + s2);
		System.out.println("전부 소문자로 바꾸기 : " + s2.toLowerCase());
		
		//subString
		System.out.println("subString(args) : " + s3.substring(1));
		System.out.println("subString(args, args) : " + s3.substring(1, 3));
	}

}
