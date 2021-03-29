package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
	
	//메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
	
	// 정적 멤버 클래스
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
			
		}
		
		//Object 클래스의 hashCode(): 객체의 주소값으로 해쉬값(정수)을 생성한다.
		
		@Override
		public int hashCode() {
			// Objects.hash():매개값으로 주어진 값들 이용해 해시 코드 생성한다.
			return Objects.hash(sno, name);
		}
		
		
	}

}
