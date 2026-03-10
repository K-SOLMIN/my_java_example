package ch08;

public class WrapperClassDemo {

	public static void main(String[] args) {
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i + 10);
		
		Integer wrapperI = 10; //자동 박싱
		int j = wrapperI; //자동 언박싱
		
//		Integer wrapperI = Integer.valueOf(s);
		
		System.out.println(wrapperI);
		
		
//		Integer w = new Integer(10);
//		System.out.println(w);
	}

}
