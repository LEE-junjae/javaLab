package exam07_exam01;

import java.util.Scanner;

public class WhileKeyControl {

	public static void main(String[] args) throws Exception {

		/*
		 * int keyCode = System.in.read(); // 키코드를 변수로 설정시 메소드를 throws Exception 변환시켜줘야
		 * 된다 System.out.println(keyCode); // 키보드값 읽어오기
		 */	
		
		Scanner scanner = new Scanner(System.in); // (System.in) 키보드로부터 입력된 문자열의 값을 읽을수 있음 
		
		String inputString = scanner.nextLine();
		
		System.out.println(inputString);
		
	}

}
