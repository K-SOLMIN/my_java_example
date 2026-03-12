package ch12;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//최종연산
public class TerminalOperation {

	public static void main(String[] args) {
		System.out.println(Nation.nations.stream().allMatch(n -> n.getPopulation() > 100)); //모든 국가의 인구가 1억이 넘는지 //전체 ture면 true
		
		Optional<Nation> n = Nation.nations.stream().findFirst(); //findFirst --> return Optional 제일 처음거
		n.ifPresent(Util::print);
		
		Optional<Nation> n1 = Nation.nations.stream().filter(Nation::isIsland).findFirst();
		n.ifPresent(Util::print);
		
		Stream<Nation> ns = Nation.nations.stream();
		
		Optional<Nation> max = ns.max(Comparator.comparing(Nation::getPopulation));
		System.out.println("\n인구가 가장많은 나라 : " + max.get());
		
		OptionalInt oi = IntStream.of(1, 2, 3, 4, 5).max();
		System.out.println("intMax : " + oi.getAsInt());
		
		long count = IntStream.of(1, 2, 3, 4, 5).count();
		int sum = IntStream.of(1, 2, 3, 4, 5).sum();
		
		System.out.println("count : " + count + " sum : " + sum);
	}

}
