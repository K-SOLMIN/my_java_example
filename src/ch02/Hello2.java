package ch02;

public class Hello2 {

	public static void main(String[] args) {
		// 요구사항 - 3 더하기 5 의 결과를 화면에 출력하는 프로그램을 작성해줘
//		int v1 = 300000000;
//		int v2 = 500000000;
//		System.out.println(v1 + v2);
		
		//요구사항 30억 더하기 50억의 결과를 화면에 출력하는 프로그램을 작성해줘
		long v1 = 3000000000L;
		long v2 = 5000000000L;
		System.out.println(v1 + v2);
		
		//요구사항 - 3.2 더하기 5.4의 결과를 화면에 출력하는 프로그램을 작성해줘
//		float v3 = 3.2F;
//		float v4 = 5.4f;
//		System.out.println(v3 + v4);
		
		//요구사항 - 0.1f 더하기 0.2f 의 결과를 화면에 출력하는
		//float은 오차가 발생할 확률이 높다
		//ex) float v3 = 3.14f; float v4 = 5.4f;
		//float sum = v3 + v4; 
		float v3 = 3.14f;
		float v4 = 5.4f;
		float sum = v3 + v4;
		System.out.printf("sum = %.16f \n", sum);
		
		double v5 = 3.14f;
		double v6 = 5.4;
		double sum2 = v5 + v6;
		System.out.printf("sum2 = %.16f \n", sum2);
		
		float f1 = 0.1f;
		float f2 = 0.2f;
		float f3 = 0.3f;
		double d = 0.3;
		
		System.out.printf("f = %.16f \n", f1);
		System.out.printf("f2 = %.18f \n", f2);
		System.out.printf("f3 = %.18f \n", f3);
		System.out.printf("d = %.18f \n", d);
		
		System.out.println((f1 + f2) == f3);
		System.out.println("f1 : " + f1 + " f2 : " + f2 + " f3 : " + f3);
	}

}
