package collection;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberArrayList.addMember(member1);		
		memberArrayList.addMember(member2);		
		memberArrayList.addMember(member3);		
		memberArrayList.addMember(member4);		
		
		memberArrayList.showAllMember();
		
		memberArrayList.removerMember(1004);
		memberArrayList.showAllMember();
	}

}

class MemberArrayList {
	
	// 회원목록
	ArrayList<Member> list;

	// 회원목록 리스트 생성
	public MemberArrayList() {
		list = new ArrayList<Member>();
	}
	
	// 회원목록에 회원을 추가하는 메소드
	public void addMember(Member member) {
		list.add(member);
	}
	
	// 회원목록에 일치하는 아이디 삭제하는 메소드
	public void removerMember(int memberld) {
		
		for (int i = 0; i < list.size(); i++) {
			
			Member member = list.get(i);
			int id = member.memberId;
			
			if (id == memberld) { //회원의 아이디가 1004가 맞다면
				list.remove(i);
				System.out.println(memberld + "번 회원을 삭제하였습니다.");
				return;
			}
		}
		System.out.println(memberld + "번 회원이 존재하지 않습니다.");
	}
	
	// 회원정보를 출력하는 메소드
	void showAllMember() {
		
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		System.out.println();
	}
	
}








