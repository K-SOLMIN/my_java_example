package ch05.exercise;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4));
		int arr[] = {2, 3};
		System.out.println(sum(1, arr));
		System.out.println(sum(1, 2, 3, 4, 5));
	}
	
	public static int sum(int i, int... nums) {
		int total = 0;
		
		for(int j = 0; j < nums.length; j++) {
			total += nums[j];
		}
		
		return total;
		
	}
	
//	public static int sum(int num, int[] intArr) {
//		int total = 0;
//		
//		for(int i : intArr) {
//			total += i;
//		}
//		
//		return total;
//	}
}
