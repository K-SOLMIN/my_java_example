package ch08;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		//추상클래스이므로 생성자로 객체생성불가
		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		
		System.out.println("AM : " + Calendar.AM);
		System.out.println("DAY_OF_WEEK : " + Calendar.DAY_OF_WEEK);
		System.out.println("YEAR : " + Calendar.YEAR);
		System.out.println("MONTH : " + Calendar.MONTH);
		
//		매개변수로 calendar 상수를 넣어주면 값 return
		System.out.println("year : " + c.get(Calendar.YEAR)); //year
		System.out.println("day_of_week : " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("am : " + c.get(Calendar.AM)); //0 am 1 pm
		System.out.println("month : " + c.get(Calendar.MONTH));
		System.out.println("hour : " + c.get(Calendar.HOUR));
	}

}
