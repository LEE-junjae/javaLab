package exam03_constructor02;

public class Korean {

	//Field
	String nation = "대한민국";
	String name;
	String ssn;
	
	/*
	//Constructor
	Korean(String n, String s) {
		name = n;
		ssn = s;
	*/
	
	//Constructor
	Korean(String name, String ssn) {  //매개 변수 이름은 필드 이름과 유사하거나 동일한 것 사용 권장
		this.name = name; //필드와 매개 변수 이름 완전히 동일할 경우 this.필드로 표현
		this.ssn = ssn; //this.name는 여기서 name은 필드값인 String name;값을 표현하기 위해서 일부러 사용
		
	}
	
}
