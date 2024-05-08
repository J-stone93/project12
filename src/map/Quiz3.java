package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {
		
		HashMap<String,Float> map = new HashMap<String, Float>();
		
		map.put("국어", 80.0f); // float 타입은 식별자 f 필요
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		Set<String> keyset = map.keySet(); 
		for (String key : keyset) { // for문에 keyset에는 map은 올 수 없음
			System.out.println(key + map.get(key));
		}
		

		Collection<String> keys = map.keySet();
		Collection<Float> values = map.values();
		for (Float value : values) {
			System.out.println(value);
		}
		
		System.out.println(keys);
		
		System.out.println(values);
	}

}
