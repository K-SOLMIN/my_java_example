package ch13;

import java.io.IOException;

public class IOStreamDemo {

	public static void main(String[] args) throws IOException {
		// Scanner가 아닌 System.in (입력 스트림) 으로 데이터를 읽는다
		int b = 0;
		int[] arr = new int[100];
		int length = 0;
		
		System.out.println("---------- 입력 스트림 -----------");
		while((b = System.in.read()) != 13) {
			arr[length] = b;
			length++;
			System.out.println((char) b + "(" + b + ")");
		};
		
		System.in.close();
		
		// System.out (출력 스트림) 으로 데이터를 출력하자.
		System.out.println("---------- 출력 스트림 -----------");
		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) break;
			System.out.write(arr[i]);
		}
		
		System.out.flush();
		
		System.out.close();
	}

}
