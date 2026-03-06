package ch06;

//자식
public class Ball extends Circle{
	
	
	//기냥 부모가 주는거랑 똑닮아야함 접근제한자는 큰범위로는 괜찮다. exception도 마찬가지
//	@Override
//	public void findArea(){
//		super.findArea();
//		System.out.println("넓이는 " + 4 * (3.14 * radius * radius) + " 입니다.");
//	}
	
	
}

//부모
//class Circle {
//	int radius;
//	protected String pro;
//	public String pub;
//	private String pri;
//	public static String sta;
//	public final String FIN = "Final";
//	
//	//private, final, static으로 선언된 변수나 메소드는 상속대상이아니다.
//	private void secret() {
//		System.out.println("비밀입니다.");
//	}
//	
//	final void finalMethod() {
//		
//	}
//	
//	static void staticMethod() {
//		
//	}
//	
//	public void findRadius() {
//		System.out.println("반지름은 " + radius + " 입니다.");
//	}
//	
//	public void findArea() throws NullPointerException, ConcurrentModificationException, IllegalArgumentException{
//		System.out.println("넓이는 " + (3.14 * radius * radius) + " 입니다.");
//	}
//}
