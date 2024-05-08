package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz5 {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);

		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		
		memberHashMap.showAllMember();
	}

}

class MemberHashMap {
	
	HashMap<Integer, Member> map;
	
	public MemberHashMap() {
		map = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		map.put(member.memberId, member);
	} 
	
	public void removeMember(int memberId) {
		Set<Integer> keys = map.keySet();
		
//		for (int key : keys) {
//			Member member = map.get(key);
//			if (member.memberId == memberId) {
//				map.remove(memberId);
//				System.out.println(memberId + "번 회원을 삭제하셨습니다.");
//				return;
//			}
//		}
		if (map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId + "번 회원을 삭제하셨습니다.");
			return; // return 대신에 else를 넣어도 됨
		}
		// 없으면 에러메세지 출력
		System.out.println(memberId + "번 회원은 존재하지 않습니다.");
	}
	public void showAllMember( ) {
//		Set<Integer> keys = map.keySet();
//		
//		System.out.println("모든 회원을 출력합니다.");
//		for (int key : keys) {
//			Member member = map.get(key);
//			System.out.println(member);
//		}
		
		System.out.println("모든 회원을 출력합니다.");
		Collection<Member> values = map.values();
		
		for(Member member : values) {
			System.out.println(member);
		}
	}
	
}



