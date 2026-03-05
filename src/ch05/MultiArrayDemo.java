package ch05;

public class MultiArrayDemo {

	public static void main(String[] args) {
		int[][] interests = {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}, {21, 22, 23, 24, 25}}; //int 행3 열5 인 2차원 배열
		
		System.out.println("행의길이 : " + interests.length);
		System.out.println("열의길이 : " + interests[0].length);
		
		for(int i = 0; i < interests.length; i++) {
			for(int j = 0; j < interests[i].length; j++) {
				System.out.printf("%2d ", interests[i][j]);
			}
			System.out.println();
		}
	}

}
