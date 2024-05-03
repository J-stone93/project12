package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz4 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(100);
		hashset.add(200);
		hashset.add(300);
		
		System.out.println("set의 크기: " + hashset.size());
		
		Iterator<Integer> ir = hashset.iterator();
		
		while (ir.hasNext()) {
			Integer member = ir.next();
			System.out.println(member);
		}
		
		for (Integer integer : hashset) {
			System.out.println(integer);
		}
	}
	
}
