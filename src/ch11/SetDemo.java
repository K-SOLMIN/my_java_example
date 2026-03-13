package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = Set.of("사과", "바나나", "수박", "망고", "1과", "2과", "3과", "4과", "5과", "6과", "7과", "8과");
		// 불변객체를 -> 가변으로
		set = new HashSet<>(set);
		
		set.add("오렌지");
		System.out.println(set);
		
		set.add("오렌지");
		System.out.println(set);;
		
		System.out.println("set에 오렌지가 있어? : " + set.contains("오렌지"));
		
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println("lower : " + tree.higher("오렌지"));
		System.out.println("higher : " + tree.higher("오렌지"));
		
	}

}
