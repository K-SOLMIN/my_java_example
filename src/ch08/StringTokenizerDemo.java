package ch08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
//		String s = "of the people, by the people, for the people";
		String s = "of!the!people,!by!the!people,!for!the!people";
		//2 parameter 구분자
		//,(공백) 두개를 묶어서는 안됨..
		StringTokenizer st = new StringTokenizer(s, ",!");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
		
	}

}
