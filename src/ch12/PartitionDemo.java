package ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionDemo {

	public static void main(String[] args) {
		Stream<Nation> nations = Nation.nations.stream().limit(4);
		
		Map<Boolean, List<Nation>> resultIsland = nations.collect(Collectors.partitioningBy(Nation::isIsland));
		System.out.println(resultIsland);
		
		nations = Nation.nations.stream().limit(4);
		
		Map<Boolean, Long> resultCount = 
				nations.collect(Collectors.partitioningBy(Nation::isIsland, Collectors.counting()));
		System.out.println(resultCount);
	}

}
