package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
				
		HashSet<String> hashSet = new HashSet<String>();
		// Set은 내용의 순서(index)가 없어서 get메소드를 사용할수 없다
		
		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		// Set은 중복된 값을 넣을 수 없음 에러 안남
		hashSet.add("도우너");
		
		//리스트와 삭제 방법이 다름
		hashSet.remove("도우너");
		
		//Iterator 객체 생성
		Iterator<String> ir = hashSet.iterator();
		
		//반복횟수가 정확하지 않을 때 while문에 if문 사용
		while(true) { // 다음 요소가 있다면
			
			if(ir.hasNext() == true) {
				String member = ir.next(); // 다음요소를 가져옴
				System.out.println(member + " ");
			} else {
				break;
			}
		}
//		while(ir.hasNext()) {
//			String member = ir.next();
//			System.out.println(member + " ");
//		}
		
		// 일반for문은 index를 필요함
		// 람다식for문은 index를 필요로하지 않음
		// 값을 저장할 변수 : 자료구조
		
		for (String member : hashSet) {
			System.out.println(member + " ");
		}
		
	}

}







