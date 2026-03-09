package ch08;

public class StringBuilderDemo {

	public static void main(String[] args) {
		//불변객체 String은 변수의 값이 달라지면 hashCode값이 달라짐
//		String s = new String("hi");
//		System.out.println(s.hashCode());
//		
//		s += "!";
//		System.out.println(s.hashCode());
//		
////		반대로 StringBuilder는 변수의 값이 달라져도 hashCode값이 같음
//		StringBuilder sb = new StringBuilder("hi");
//		System.out.println(sb.hashCode());
//
//		sb.append("!!!");
//		System.out.println(sb.hashCode());
//		
//		sb.replace(0, 2, "hello");
//		System.out.println(sb);
		
		//nanoTime = 68334100 ~ 76676600언저리
		long start = System.nanoTime();
		
		String result = "";
		for(int i = 0 ; i < 100000; i++) {
			result += i;
		}
		
		long end = System.nanoTime();
		
		System.out.println(end - start);
		
		
		//835100 ~ 1736900
		StringBuilder sb = new StringBuilder();
		
		start = System.nanoTime();
		
		for(int i = 0 ; i < 100000; i++) {
			sb.append(i);
		}
		
		end = System.nanoTime();
		
		System.out.println(end - start);
	}

}
