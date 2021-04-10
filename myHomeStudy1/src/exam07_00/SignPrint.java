//표준입력장치(콘솔)로 입력 받은 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 프로그램을 삼항 연산자를
//이용해서 작성하시오. [20점]
package exam07_00;

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