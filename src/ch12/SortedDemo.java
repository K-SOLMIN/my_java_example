package ch12;

import java.util.Comparator;

public class SortedDemo {
	public static void main(String[] args) {
		System.out.println("================= 국가 이름 순서(오름차순) ================");
		Nation.nations.stream()
						.sorted(Comparator.comparing(Nation::getName)) //comparator 람다식, Comparator.comparing(비교기준), Comparator.comparing(비교기준).reversed()
						.forEach(Util::printWithParenthesis);
		
		System.out.println();
		System.out.println("================= 국가 이름 순서(내림차순) ================");
		
		//comparator 람다식, Comparator.comparing(비교기준), Comparator.comparing(비교기준).reversed()
		Nation.nations.stream()
						.sorted(Comparator.comparing(Nation::getName ).reversed()) 
						.forEach(Util::printWithParenthesis);
		
		System.out.println();
		System.out.println("================= GDP순 (오름차순) ================");
		
		Nation.nations.stream()
						.sorted(Comparator.comparing(Nation::getGdpRank).reversed())
						.forEach(Util::printWithParenthesis);
		
		System.out.println();
		System.out.println("================= GDP순 (내림차순) ================");
		
		Nation.nations.stream()
						.sorted(Comparator.comparing(Nation::getGdpRank))
						.forEach(Util::printWithParenthesis);
		
//		Nation.nations.stream()
//						.sorted(Comparator.comparing((Nation n) -> n.getGdpRank()))
//						.forEach(Util::printWithParenthesis);
		
		System.out.println();
		System.out.println("================= GDP순 (내림차순) ================");
		Nation.nations.stream()
						.sorted(Comparator.comparing(Nation::getPopulation))
						.forEach(Util::printWithParenthesis);
	}
}
