package exam03_constructor02;

public class Korean {

	//Field
	String nation = "���ѹα�";
	String name;
	String ssn;
	
	/*
	//Constructor
	Korean(String n, String s) {
		name = n;
		ssn = s;
	*/
	
	//Constructor
	Korean(String name, String ssn) {  //�Ű� ���� �̸��� �ʵ� �̸��� �����ϰų� ������ �� ��� ����
		this.name = name; //�ʵ�� �Ű� ���� �̸� ������ ������ ��� this.�ʵ�� ǥ��
		this.ssn = ssn; //this.name�� ���⼭ name�� �ʵ尪�� String name;���� ǥ���ϱ� ���ؼ� �Ϻη� ���
		
	}
	
}
