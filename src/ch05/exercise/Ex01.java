package ch05.exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고싶은 문자 : ");
		char c = sc.nextLine().charAt(0);
		
		count = countChar(str, c);
		
		System.out.println(count);
		
		sc.close();
	}
	
	static int countChar(String s, char c) {
		int count = 0;
		String allUpper = s.toUpperCase();
		String allLower = s.toLowerCase();
		
		if(c >= 65 && c <= 90) {
			for(int i = 0; i < s.length(); i++) {
				if(allUpper.charAt(i) == c) {
					count++;
				}
			}			
		} else {
			for(int i = 0; i < s.length(); i++) {
				if(allLower.charAt(i) == c) {
					count++;
				}
			}		
		}
		
		count = 0;
		
		for(int i = 0; i <s.length(); i++) {
			if(String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(c)));
			count++;
		}
		
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == c || s.charAt(i) == c - 32) {
//				count++;
//			}
//		}
		
		return count;
	}
}
