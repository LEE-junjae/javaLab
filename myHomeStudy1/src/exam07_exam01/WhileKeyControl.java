package exam07_exam01;

import java.util.Scanner;

public class WhileKeyControl {

	public static void main(String[] args) throws Exception {

		/*
		 * int keyCode = System.in.read(); // Ű�ڵ带 ������ ������ �޼ҵ带 throws Exception ��ȯ�������
		 * �ȴ� System.out.println(keyCode); // Ű���尪 �о����
		 */	
		
		Scanner scanner = new Scanner(System.in); // (System.in) Ű����κ��� �Էµ� ���ڿ��� ���� ������ ���� 
		
		String inputString = scanner.nextLine();
		
		System.out.println(inputString);
		
	}

}
