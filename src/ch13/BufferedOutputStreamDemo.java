package ch13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		long start, end, duration;
		String inputFile = "C:/Program Files (x86)/Internet Explorer/iexplore.exe";
		String outputFile = "C:/temp/iexplore1.exe";
		
		// BufferedOutputStream, BufferedInputStream 속도차이
//		start = System.nanoTime();
//		
//		try(FileInputStream fis = new FileInputStream(inputFile);
//				BufferedInputStream bis = new BufferedInputStream(fis);
//					FileOutputStream fos = new FileOutputStream(outputFile);
//						BufferedOutputStream bos = new BufferedOutputStream(fos);) {
//			
////			int data = 0;
//			
////			while((data = bis.read()) != -1) {
////				bos.write(data);
////			}
//			
//			while(bis.available() > 0) {
//				bos.write(bis.read());
//			}
//			
//			
//			bos.flush();
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		end = System.nanoTime();
//		
//		duration = end - start;
//		System.out.println("Buffer : " + duration); //1,612,219,800
		
		// FileInputStream, FileOutputStream 속도차이
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(inputFile);
				OutputStream os = new FileOutputStream(outputFile);) {
			
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			os.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		end = System.nanoTime();
		
		duration = end - start;
		System.out.println("non Buffer : " + duration); //3,846,254,000
	}

}
