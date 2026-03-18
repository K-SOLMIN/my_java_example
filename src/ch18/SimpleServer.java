package ch18;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		//192.168.0.13(사설ip) 다른 사람이 부를때
		//127.0.0.1 내가 나를 부를때이고 그걸 localhost라고함
		//port = 5000 서버를 지칭하는 상세주소 -> 5000번으로 서버를 등록함
		int receiveCount = 0;
		
		while(receiveCount < 5) {
			try (ServerSocket server = new ServerSocket(5000);
					Socket connection = server.accept(); //요청을 허용 -> 데이터를 주고받고 반복문이 아니라 한번만 받고 연결을 끊음
						InputStream is = connection.getInputStream(); //data를 inputstream을 통해서 받음
							ObjectInputStream ois = new ObjectInputStream(is);) {
				String data = (String) ois.readObject(); //받은 object를 형변환해서 
				System.out.println("받은 객체 = " + data);//출력
				receiveCount++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}