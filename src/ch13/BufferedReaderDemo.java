package ch13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		long start, end, duration;
		String inputFile = "C:/temp/file1.txt";
		String outputFile = "C:/temp/file2.txt";
		
		// BufferedReader, BufferedWriter 속도차이
		start = System.nanoTime();
		
		try(BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));) {

			int c;
			
			while((c = br.read()) != -1) {
				bw.write(c);
			}
			
			bw.flush();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		end = System.nanoTime();
		
		duration = end - start;
		System.out.println("Buffer : " + duration); //1,612,219,800
		
		// FileReader, FileWriter 속도차이
		start = System.nanoTime();
		
		try(FileReader fr = new FileReader(inputFile);
				FileWriter fw = new FileWriter(outputFile);) {
			

			int length;
			char[] data = new char[8192];
			
			while((length = fr.read(data)) != -1) {
				fw.write(data, 0, length);
			}
			
			fw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		end = System.nanoTime();
		
		duration = end - start;
		System.out.println("non Buffer : " + duration); //3,846,254,000
		
	}

}
