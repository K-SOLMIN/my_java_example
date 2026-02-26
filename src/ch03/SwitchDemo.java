package ch03;

public class SwitchDemo {
	public static void main(String[] args) {
		//switch 문
//		int number = 3;
		
//		switch(number) {
//			case 1 : System.out.println("*"); break;
//			case 2 : System.out.println("*"); break;
//			case 3 : System.out.println("*"); break;
//		}
		
		String yoil = "월";
		//의도적 낙하를 위한 break
		//else 역할을 하는 default가 있다.(구버전, 낙하방식)
		switch(yoil) {
			case "월" :
			case "화" :
			case "수" : System.out.println("평일입니다."); break;
			case "토" :
			case "일" : System.out.println("주말입니다.");
		}
		
		//최신switch
		//낙하방식 x 
		switch(yoil) {
			case "월", "화", "수", "목", "금" -> System.out.println("평일입니다.");
			case "토", "일" -> System.out.println("주말입니다.");
		}
		
		//최신switch
		//낙하방식 x
		yoil = "메롱";
		String result = "";
		
		//값을 반환받을 수 있으며 반환받으려면 default가 반드시 존재해야한다.
		result = 
			switch(yoil) {
				case "월", "화", "수", "목", "금" -> "평일입니다.";
				case "토", "일" -> "주말입니다.";
				default -> "존재하지않는 요일입니다.";
			};
		
		System.out.println("result : " + result);
		
		//yield를 사용해서 값을 리턴할 수 있으며 yield있을때는 break를 쓰지 않아도 된다.
		String animal = "호랑이";
		String kind = 
			switch(animal) {
				case "호랑이", "사자" : yield "포유류" ;
				default : yield "...";
			};
		
		System.out.println("animal 종은 : " + kind + "입니다.");
	}
}
