package collection;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			
			char ch = list.get(i); //오토박싱
			
			if(ch == 'A') {
				list.remove(i);
			}
		}
		System.out.println(list);
		
	}

}
