package ch05;

import java.util.Arrays;

import ch04.Circle;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] scores = new int[5]; //초기화를 별도로 하지 않으면 어떤 값으로 초기화 될까요?
		
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
		System.out.println("syso : " + scores);
		System.out.println(Arrays.toString(scores));
		
		//배열에 값 넣기
		scores[3] = 100;
		int score = scores[3];
		
		System.out.println(score);
		
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
		System.out.println(Arrays.toString(scores));
		
		//문자열(사람의 이름)을 담는 배열
		String[] names = new String[3];
				
		//객체(원)을 담는 배열
		Circle[] circles = new Circle[3];
		circles[0] = new Circle();
		
		System.out.println(circles);
		System.out.println(Arrays.toString(circles));
		System.out.println(circles[0].getRadius());
		
	}
}
