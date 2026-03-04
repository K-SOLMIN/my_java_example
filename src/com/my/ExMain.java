package com.my;

import java.util.Arrays;

public class ExMain {
	
//	n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고, 1,000,000보다 작거나 같은 자연수이다.
//	자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
//	첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
	public static void main(String[] args) {
		int[] intArr = new int[100000];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 1_000_000) + 1;
			for(int j = i; j > 0; j--) {
				System.out.println("실행");
				if(intArr[i] == intArr[j - 1]) i--;
			}
		}
		
		System.out.println(Arrays.toString(intArr));
	}

}
