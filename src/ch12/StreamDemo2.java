package ch12;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		int[] ia = {2, 3, 5, 6, 11, 13};
		String[] sa = {"The", "Pen", "is", "mighter", "than", "the", "sword"};
		
		IntStream is = Arrays.stream(ia);
		IntSummaryStatistics iss = is.summaryStatistics();
		System.out.println("is average : " + iss.getAverage());
		System.out.println("is sum : " + iss.getSum());
		
		//System.out.println(is.summaryStatistics()); //IntSummaryStatistics{count=6, sum=40, min=2, average=6.666667, max=13} 걍 이것저것
		
		is = Arrays.stream(ia);
		OptionalDouble od = is.average();
		double average = od.getAsDouble();
		System.out.println("is average : " + average);
		
		is = Arrays.stream(ia);
		System.out.println("is sum : " + is.sum());
		
		Stream<Integer> is1 = Stream.of(2, 3, 4, 5, 11, 13);
		IntStream is2 = IntStream.of(2, 3, 5, 6, 11, 13);
		is2.sum();
		
		Stream<String> ss = Arrays.stream(sa);
		
		is = IntStream.iterate(100, i -> i * 2);
		
		is = new Random().ints(0, 100);
		
		Stream<Double> ds = Stream.generate(Math::random);
		
		is = IntStream.rangeClosed(1, 10); //range start ~ (end - 1) : rangeClosed start ~ end
	}
}
