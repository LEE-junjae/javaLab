package chap13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignPrint {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String result;
		
		System.out.println("정수를 입력하세요 = ");
		num = Integer.parseInt(in.readLine());
		
		result = num > 0? "양수":(num <0? "음수": "0");
		
		System.out.println(result);
	}
		
}		
