package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();
		
		map.put(new Fruit("사과"), 3);
		map.put(new Fruit("바나나"), 5);
		map.put(new Fruit("자몽"), 4);
		map.put(new Fruit("자몽"), 2);
		map.put(new Fruit("딸기"), 1);
		map.put(null, null);
		
//		Set<Map.Entry<Fruit, Integer>> fruitSet = map.entrySet();
//		
//		for(Map.Entry<Fruit, Integer> set : fruitSet) {
//			System.out.println(set);
//		}
		System.out.println("1번 자몽 : " + new Fruit("자몽").hashCode());
		System.out.println("2번 자몽 : " + new Fruit("자몽").hashCode());
		System.out.println("size : " + map.size());
		System.out.println(map);
	}
}

class Fruit {
	String name;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return name;
	}
	
	//hashCode, equals
}
