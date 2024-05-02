package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		//list 담고 싶은 자료형을 Member로 설정
		ArrayList<Member> list = new ArrayList<Member>();
		// add만 사용할꺼면 참조변수로 담지 않아도 됨
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		
		list.add(member1); //회원 추가
		list.add(member2);
		list.add(member3);
		list.add(member3);
		// list.add(new Member(1003, "도우너")로 회원 추가 가능
		
		System.out.println(list.get(0)); //회원 꺼내기
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		// collection.Member@5305068a로 2, 3의 주소값이 같음
		
		
		list.remove(0); //1번재 회원 삭제
		
		System.out.println("전체 회원 수" + list.size());
		
		//리스트 출력하기
		System.out.println(list);
		
		//for문을 이용해서 전체 회원 정보 출력하기
		for(int i = 0; i < list.size(); i++) {
			Member member = list.get(i); //리스트에서 회원을 꺼내서 참조변수에 담음
			System.out.println(member.toString());
		}
		
	}

}

// 쇼핑몰 회원
class Member {
	//멤버 변수
	int memberId; //회원아이디
	String memberName; //회원이름
	
	//생성자 함수는 인스턴스를 생성하고 멤버변수를 초기화하기 해줌
	public Member(int memberId, String memberName) {
		
		this.memberId = memberId;
		this.memberName = memberName;
	}
	//주소값이 아니라 값을 보기 위해서 toString 재정의
	@Override
	public String toString() {
		return "Member [회원아이디: " + memberId + ", 회원이름: " + memberName + "]";
	}
	
}











