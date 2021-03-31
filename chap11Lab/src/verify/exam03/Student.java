package verify.exam03;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
	return studentNum;
	}
	// 작성 위치
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj; //강제형 변환, Student <- Object
			if (studentNum.equals(student.getStudentNum())) {
			return true;
			}
		}
		return false;
	
	}
	

}
