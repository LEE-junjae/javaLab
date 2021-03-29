package sec03.exam04_clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	//clone()메소드를 이용하여 객체를 복제한다.
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();//객체 깊은 복제
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
	

}
