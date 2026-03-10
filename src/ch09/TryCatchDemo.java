package ch09;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchDemo {

	public static void main(String[] args) {
//		FileInputStream fis;
//		
//		try {
//			fis = new FileInputStream("C:/java_example/sample/src/ch09/file.txt");
//			
//			int data = 0;
//			
//			while((data = fis.read()) != -1) {
//				System.out.print((char) data);
//			}
//			
//			fis.close();
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			
//		}
		
		try(FileInputStream fis = new FileInputStream("C:\\java_example\\sample\\resources\\file.txt")) {
			int data = 0;
			
			while((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
