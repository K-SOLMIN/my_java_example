package ch14;

public class ThreadDemo3 {
	
	public static void main(String[] args) {
		
		//익명객체 방식
//		Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i = 0; i < 5; i++) {
//					System.out.println(i + 1);
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						System.out.println("interrupt 예외 발생");
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		});
		
		// 람다식으로
		Thread t = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " " + (i + 1));
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("interrupt 예외 발생");
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " " + (i + 1));
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("interrupt 예외 발생");
					e.printStackTrace();
				}
			}
		});
		
		long start = System.currentTimeMillis();
		
		t.start();
		t2.start();
//		t.run(); //내가 할 건 아님(싱글스레드)  
//		t2.run();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " hello " + (i + 1));
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("interrupt 예외 발생");
				e.printStackTrace();
			}
			
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
	}

}
