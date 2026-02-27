package ch03;

public class Ex3 {

	public static void main(String[] args) {
		//중첩반복문
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(i + j + 1);
//			}
//			System.out.println();
//		}
		
		System.out.println("1 2 3");
		System.out.println("2 3 4");
		System.out.println("3 4 5");
		
		for(int i = 1; i <= 10; i++) {
//			System.out.printf("%2d %2d %2d %2d %2d %2d\n", i, i + 1, i + 2, i + 3, i + 4, i + 5); 비효율
			for(int j = 0; j < 10; j++) {
				if(j == 0) {
					System.out.printf("%2d", i + j);
				} else {
					System.out.printf("  %2d", i + j);					
				}
			}
			System.out.println();
		}
	}

}
