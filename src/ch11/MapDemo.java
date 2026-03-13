package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 3, "바나나", 4, "딸기", 1);
		
		System.out.println(map.get("사과"));
		System.out.println(map.size());
		System.out.println(map.containsKey("망고"));
		System.out.println(map.containsValue(2));
		
		HashMap<String, Integer> hash = new HashMap<>(map);
		hash.put("망고", 10); //key가 없는 경우에는 새로운 항목을 추가
		System.out.println(hash);
		
		hash.put("망고", 4); //key가 있는 경우에는 항목을 수정
		System.out.println(hash);
		
		hash.remove("망고");
		System.out.println(hash);
		
		hash.forEach((k, v) -> System.out.println(k + " " + v));
		
		Set<String> keySet = hash.keySet(); //key를 Set으로 return
		System.out.println("keySet : " + keySet);
		
		Collection<Integer> values = hash.values(); //values를 collection 으로 return
		values.forEach(System.out::println);
		
		Set<Map.Entry<String, Integer>> entrySet = hash.entrySet();
		System.out.println("entrySet : " + entrySet);
		
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println("entryKey : " + entry.getKey() + ", entryValue : " + entry.getValue());
		}
	}

}
