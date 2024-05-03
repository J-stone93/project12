package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) {
		HashMap<Character, String> hashmap = new HashMap<Character, String>();
		
		hashmap.put('a', "사과");
		hashmap.put('b', "바나나");
		hashmap.put('c', "코코넛");
		
		System.out.println(hashmap.get('b'));
		
		hashmap.replace('b', "블루베리");
		System.out.println(hashmap);
		
		hashmap.remove('a');
		System.out.println(hashmap);
		
		// 특정키값이 존재하는지 확인하기!
		if (hashmap.containsKey('b')) {
			System.out.println("map에 b라는 키가 있습니다");
		} else {
			System.out.println("map에 b라는 키가 있습니다");			
		}
		
		Collection<Character> keys = hashmap.keySet();
		Collection<String> values = hashmap.values();
		System.out.println(keys);
	}

}
