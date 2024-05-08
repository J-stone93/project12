package map;

import java.util.HashMap;
import java.util.Set;

// HashMap 클래스를 사용하여 쇼핑몰 회원 관리하기
public class Ex2 {

	public static void main(String[] args) {
		
		HashMap<Integer, Member> map = new HashMap<Integer, Member>();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");

		// 회원 추가
		map.put(member1.memberId, member1);
		map.put(member2.memberId, member2);
		map.put(1003, new Member(1003, "도우너"));
		
		// 회원 조회
		System.out.println(map.get(1001));
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));
		
		// 1번 회원 삭제
		map.remove(1001);
		
		// 전체 회원 수 출력
		System.out.println("전체 회원 수:" + map.size());
		
		// 전체 회원 목록 출력
		System.out.println(map);
		
		// 회원 목록 순회하기
		Set<Integer> keyset = map.keySet();
		
		// 변수: 자료구조 (배열,리스트,set O,map X)
		for (int key : keyset) {
			System.out.println("[key]" + key + "[value]" + map.get(key));
		}

	}

}

//회원 클래스 만들기
class Member {
	
	int memberId; 
	String memberName;
	
	//모든 멤버변수를 초기화하는 생성자
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	//회원정보를 반환하는 toString 재정의
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}













