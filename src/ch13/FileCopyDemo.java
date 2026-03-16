package ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// c:/temp/test1.txt 를 읽어서 c:/temp/test2.txt 로 저장하는 예제
		String input = "c:/temp/test1.txt";
		String output = "c:/temp/test2.txt";
		
		try(InputStream is = new FileInputStream(input);
				OutputStream os = new FileOutputStream(output);) {
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			os.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
//		is.close();
//		os.close();
	}

}
