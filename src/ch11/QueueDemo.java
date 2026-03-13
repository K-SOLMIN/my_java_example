package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		System.out.println("q size : " + q.size());
		System.out.println("q isEmpty : " + q.isEmpty());
		
		//remove, element로도 확인할 수 있지만 값이 없을시에  exceptino이 발생할 수 있으니
		//poll, peek을 가능하면 사용하자 return null or false
//		q.remove();
//		q.element();
		
		//언더플로우 예방
		//queue는 excpetino은 발생시키지 안혹 null또는 false를 반환한다.
//		if(!q.isEmpty()) {
			q.poll(); //꺼내기
			q.peek(); //제일앞 요소 확인
//		}
			
		q.offer("a");
		q.offer("b");
		q.offer("c");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
