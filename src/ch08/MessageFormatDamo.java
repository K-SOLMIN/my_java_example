package ch08;

import java.text.MessageFormat;

public class MessageFormatDamo {

	public static void main(String[] args) {
		String format = MessageFormat.format("{0}/{1}={2}", 10 ,5 ,2);
		String[] strArr = {"2", "1", "2"};
		
		System.out.println(format);
		
		format = MessageFormat.format("{0}/{1}={2}", new Integer[] {2, 1, 2});
		System.out.println(format);
		
		format = MessageFormat.format("{0}/{1}={2}", strArr);
		System.out.println(format);
		
		format = MessageFormat.format("{0}/{1}={2}, {2}, {2}", strArr);
		System.out.println(format);
	}

}
