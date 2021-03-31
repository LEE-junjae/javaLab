package sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //정규식, \t = 탭키
		String data = "010-123-4567"; //검증데이터
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else
			System.out.println("정규식과 일치하지 않습니다.");
		
	
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		//"angel@naver.co.kr"가능
		data = "angel@naver.com";
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else
			System.out.println("정규식과 일치하지 않습니다.");
}

	

}
