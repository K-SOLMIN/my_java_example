package com.my;

import java.util.ArrayList;
import java.util.Scanner;
import static com.my.SingleToneTest.getSingleToneTest;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		String str1 = sc.next();
//		
//		System.out.print("입력3 : ");
//		int num = sc.nextInt();
//		
//		System.out.print("입력2 : ");
//		String str2 = sc.next();
//		
//		
//		sc.close();
//		
//		System.out.println("입력 1 : " + str1 + " 입력2 : " + str2 + " 입력3 : " + num);
		
//		String str1 = "hello1";
//		String str2 = "hello" + "1";
//		System.out.println(str1 == str2);
		
//		double res = 5 / 0.0;
//		System.out.println(res + 100);
//		System.out.println(Double.isInfinite(res));
		
//		double dZero = 0.1 + 0.2;
//		float fZero = 0.1f;
//		
//		System.out.printf("dZero = %.100f \n", dZero);
//		System.out.printf("fZero = %.100f \n", fZero);
//		
//		
		double d = 0.1 + 0.2;
//		BigDecimal tax = new BigDecimal("0.1");
//		
//		System.out.println(tax);
//
//		System.out.println("result : " + (d == 0.3));
//		
//		BigDecimal result;
//		BigDecimal tax = new BigDecimal("0.1");
//		BigDecimal tax2 = new BigDecimal("0.2");
//		result = tax.add(tax2);
//		
//		System.out.println("bigDecimalResult : " + (Double.parseDouble(result.toString()) == 0.3));
		
//		Person p = new Person();
//		System.out.println("pre : " + p);
//		changeValue(p);
//		System.out.println("next : " + p);
		
//		new First(new Second(new Third()));
		
//		System.out.println("정수입력 : ");
//		int num = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("문자 입력 : ");
//		String str = sc.nextLine();
		
		/*
		 * System.out.println("입력 : "); String str2 = sc.next();
		 * 
		 * System.out.println("끝" + str2);
		 * 
		 * String str3 = sc.nextLine(); System.out.println("str3  " + str3);
		 */
		
//		SingleToneTest single1 = getSingleToneTest();
//		SingleToneTest single2 = getSingleToneTest();
//		SingleToneTest single3 = getSingleToneTest();
//		SingleToneTest single4 = getSingleToneTest();
//		
//		System.out.println(single1 + " " + single2 + " " + single3 + " " + single4);
//		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//				
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(50);
//		al.add(1);
//		al.add(1000);
//		al.add(-20);
//		al.add(-77);
//		
//		al.sort((pre, next) -> {return pre - next;});
//		System.out.println(al);
//		
//		al.stream().sorted((pre, next) -> {return pre - next;}).filter(e -> {return e <= 0;});
//		
//		System.out.println(al);
		
		Parent parent = new Parent();
		parent.protectedMethod();
	}
	
	public static void changeValue(Person p) {
		p = new Person();
	}
	
	public static void First() {
		System.out.println("First 실행");
	}
	
	public static void Second() {
		System.out.println("Second 실행");
	}

}
