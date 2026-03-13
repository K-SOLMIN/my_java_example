package ch12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
		
		//1. 스트림을 만든다
		//2. 중간연산 - 1) 짝수만 걸러낸다
		//3. 중간연산 - 2) 제곱한 값을 반환한다
		//4. 최종연산 내용을 출력한다.
		
		//중간연산(filter, map)은 최종연산(foreach..)를 만나기 전까지 일 안함
		is.filter(i -> {
				System.out.println("filter : " + i);
				return i % 2 == 0;
			})
			.map(i -> {
				System.out.println("map : " + i);
				return i * i;
			})
			.forEach(i -> System.out.println("forEach : " + i));
		
//		IntStream is1 = IntStream.iterate(100, i -> i * 2); //is1, is2, ds는 무한 stream이지만 
//		is1.forEach(System.out::println);                   // Stream.limit()을 하면 매개변수로 넣어준 횟수만큼 실행된다.
		
//		IntStream is2 = new Random().ints(0, 100);
//		is2.forEach(System.out::println);
		
		Stream<Double> ds = Stream.generate(Math::random);
		ds.limit(10).forEach(System.out::println);
		
		
	}

}
