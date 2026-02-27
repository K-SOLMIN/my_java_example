package ch03;

public class Ex4 {

	public static void main(String[] args) {
		//1부터 10까지의 숫자중에서 홀수만 출력하는 프로그램을 작성
		//while문을 사용해라
		int i = 0;
		
		while(i < 10) {
//			if(i % 2 == 1) System.out.println(i);
			i++;
 			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
