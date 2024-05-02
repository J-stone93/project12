package collection;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//리스트에 값을 저장하는 메소드
		list.add(10);
		list.add(20);
		list.add(30);
		
		//리스트 안에 저장된 값을 꺼내는 메소드
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("리스트 전체 요소: " + list);
		
		list.remove(2);
		System.out.println("리스트 요소 삭제 후: " + list);
		//list도 클래스이기에 주소값이 반환이 되야하지만 Object(부모 상속)의 toString를 재정의 해서 값이 출력됨
		
		int size = list.size();
		System.out.println("리스트 크기: " + size);

	}

}










