package ch05;

public class VariableLengthDemo {

	public static void main(String[] args) {
		change("a");
		change("a", "b");
		change("a", "b", "c");
		change("a", "b", "c", "d");
		change("a", "b", "c", "d", "e", "f", "g", "h");
	}
	
	//끝이 가변적이여야함 (String... s1, int i) X안됨
	public static void change(String... s1) {
		for(String s : s1) {
			System.out.print(s + " ");
		}
		
		System.out.println();
	}
	//오버로딩
//	public static void change(String s1) {
//		
//	}
//	
//	public static void change(String s1, String s2) {
//		
//	}
//	
//	public static void change(String s1, String s2, String s3) {
//		
//	}
//	
//	public static void change(String s1, String s2, String s3, String s4) {
//		
//	}

}
