package sec03.exam01_equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj; //강제타입변환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

}
