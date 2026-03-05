package ch05;

public class MainCallDemo {

	public static void main(String[] args) {
		String[] abc = {"a", "b", "c"};
		MainArgsDemo.main(args);
		
		MainArgsDemo.main(abc);
	}

}
