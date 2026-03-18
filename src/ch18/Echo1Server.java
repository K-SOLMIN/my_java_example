package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Base64.Decoder;

public class Echo1Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in = null;
		
		server = new ServerSocket(5000);
		while(true) {
			System.out.println("연결 대기 중.....");
			
			connection = server.accept();
			System.out.println("메시지를 기다리는 중.....");
			
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String msg;
			


			char[] data = new char[8192];
			int length;

			while ((length = in.read(data)) != -1) {
				msg = new String(data, 0, length);
			    if (msg.contains("끝")) break;
			    System.out.println("읽은 메시지 메아리 : " + msg);
			}
			
//			while ((msg = in.readLine()) != null) {
//				if (msg.contains("끝")) break;
//				System.out.println("읽은 메시지 메아리 : " + msg);
//			}
			
			System.out.println("서버 종료");
			
			in.close();
			connection.close();
			server.close();
		}
		
	}
}