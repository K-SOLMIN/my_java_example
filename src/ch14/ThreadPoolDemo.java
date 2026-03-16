package ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
		
		// 람다식으로
		Thread t = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("ramda : " + (i + 1));
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("interrupt 예외 발생");
					e.printStackTrace();
				}
			}
		});
		
		ExecutorService service = Executors.newFixedThreadPool(21);
		
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		service.submit(t);
		
		
//		t.run(); 내가 할 건 아님(싱글스레드)
		
		for (int i = 0; i < 5; i++) {
			System.out.println("hello " + (i + 1));
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("interrupt 예외 발생");
				e.printStackTrace();
			}
			
		}
		
	}

}
