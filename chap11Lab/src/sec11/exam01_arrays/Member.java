package sec11.exam01_arrays;

//구현 클래스
public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
