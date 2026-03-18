package ch18;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
	public static void main(String[] args) {
		//localhost = 127.0.0.1 = 내 사설 ip주소 5000 = port번호
		try (Socket client = new Socket("localhost", 5000);
				OutputStream os = client.getOutputStream(); //data를 보낼준비
					ObjectOutputStream oos = new ObjectOutputStream(os);) {
			Person p = new Person("김솔민", 27);
			oos.writeObject(p); //데이터 보냄
			oos.flush(); //버퍼 비우기
			
			Thread.sleep(500); //보내놓고 받던말던 socket connection을 끊어버려서 잠깐 가는동안 시간을 줌
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 