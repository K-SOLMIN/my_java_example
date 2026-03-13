package ch11.exercise;

import java.util.HashMap;
import java.util.Map;

public class Ex05 {
	public static void main(String[] args) {
		Map<String, String> animals = 
				Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
		
		System.out.println("변경 전 : " + animals);
		
		Map<String, String> aniEnKo = new HashMap<>(animals);
		aniEnKo.replaceAll((k, v) -> v.toUpperCase());
		
		System.out.println("변경 후 : " + aniEnKo);
		
	}
}
