package ch05;

public class StringCompareDemo {

	public static void main(String[] args) {
		String str1 = "a"; //97
//		String str2 = "b"; //98
		String str2 = "c";
		String str3 = "A";
		
		System.out.println("compareTo : " + str1.compareTo(str2)); //return값이 0보다 크면 앞이 더크고 작으면 뒤가 더큰것 str1 - str2;
		System.out.println("compareTo : " + str2.compareTo(str1));
		System.out.println("compareTo : " + str1.compareTo(str3));
		
		System.out.println("compareToIgnoreCase : " + str1.compareToIgnoreCase(str3));
		
		System.out.println("equalsIgnoreCase : " + str1.equalsIgnoreCase(str2)); //equals는 return boolean
		
		if(str1.compareTo(str2) < 0) {
			System.out.println(str1 + "이 " + str2 + " 보다 사전 순으로 더 먼저 나옵니다.");
		} else if(str1.compareTo(str2) == 0) {
			System.out.println(str1 + "같은 내용을 가진 문자열 입니다.");
		} else {
			System.out.println(str2 + "이 사전 순으로 더 뒤에 나옵니다.");
		}
//		if(str1.compareTo(str2))
	}

}
