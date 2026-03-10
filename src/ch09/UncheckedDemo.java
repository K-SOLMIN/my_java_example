package ch09;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UncheckedDemo {

	public static void main(String[] args) {
		int n = 3;
		int m = 0;
		String s = "";
		
		try {
			System.out.println(s.length());
//			int res = n / m;
//			System.out.println(res);
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없거나, 배열의 인덱스 범위를 벗어났습니다.");
		} catch(Exception e) {
			System.out.println("알 수 없는 오류가 발생했습니다.");
		} finally {
			//예외 발생여부와 상관없이 무조건 실행됨
			System.out.println("일단 진행시켜");
		}

		try {
			unchecked();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
//		int[] arr = {1, 2, 3};
//		System.out.println(arr[3]);
	}
	
	public static void unchecked() throws ArrayIndexOutOfBoundsException {
		int[] arr = {1, 2, 3};
		System.out.println(arr[3]);
	}

}


