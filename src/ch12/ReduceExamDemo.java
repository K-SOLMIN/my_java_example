package ch12;

import java.util.stream.Stream;

public class ReduceExamDemo {
	public static void main(String[] args) {
		// 리스트에서 GDP가 20위 이내의 나라의 인구 총합을 구하시오.
		Stream<Nation> nations = Nation.nations.stream();
		
		// Optional reduce
		nations.reduce((pre, next) -> pre.getPopulation() > next.getPopulation() ? pre : next)
																.ifPresent(System.out::println);
		
		
		
		// T reduce
		nations = Nation.nations.stream();
		
		double totalPopulation = 
				nations.filter(e -> e.getGdpRank() < 20)
						.mapToDouble(Nation::getPopulation).reduce(0.0, Double::sum);
		
		System.out.println(totalPopulation);
	}
}
