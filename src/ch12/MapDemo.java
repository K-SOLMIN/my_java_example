package ch12;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MapDemo {

	public static void main(String[] args) {
		String[] sa = {"a", "b", "c", "d", "e"};
		Arrays.stream(sa).map(String::toUpperCase) //Stream<String> instance 메소드 참조
							.forEach(Util::print); //static method 참조
		
		System.out.println();
		
		Integer[] ia = {1, 2, 3, 4, 5};
		Arrays.stream(ia).map(i -> i * 2).forEach(Util::print);
		
		System.out.println();
		
		String[] sa1 = {"a1", "b1", "c2", "d3", "e4"};
		
		//1. 각원소에 2번째 글자만 잘라내서 stream으로 반환한다.
		//2. 그 문자열을 숫자로 변환해서 stream으로 반환한다.
		//3. 숫자스트림을 다시 문자 스트림으로 숫자앞에 s를 붙혀서
		//4. 출력
		
		Arrays.stream(sa1).map(s -> s.substring(1))
							.mapToInt(Integer::parseInt)
							.mapToObj(i -> "s" + i)
							.forEach(Util::print);
		
		System.out.println();
		
		//Nation의 인구만을 값으로 가지는 IntStream으로 변환하기
		//double max = Nation.nations.stream().mapToDouble(n -> n.getPopulation()).max().getAsDouble();   //.forEach(Util::print);
		OptionalDouble max = Nation.nations.stream().mapToDouble(n -> n.getPopulation()).max();

		if(max.isPresent()) System.out.println(max.getAsDouble());
	}

}
