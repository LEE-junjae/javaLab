package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {

		int n;
		Set s = new HashSet();
		//TreeSet s = new TreeSet(); //(TreeSet)숫자 정렬하는 용어
		
		Random r = new Random();
		
		//작성위치
		//set을 이용한 로또 프로그램
		
		while (s.size() != 6)
			s.add(r.nextInt(45) + 1);
		System.out.println(s);
		/*
		선생님 -정답-
		while (s.size() != 6) {
			n = r.nextInt(45) + 1; // 1~45 임의의정수
			s.add(n);
		}
		
		System.out.println(s);
		*/
		
		//set -> list 변경하여 Collection.sort()를 이용하여 정렬한다.
		
		/*
		List list = new ArrayList(s);
		Collection.sort(list);
		
		System.out.println(s);
		System.out.println(list);
		*/
	}
}

// 실행 결과
// [7, 41, 25, 27, 29, 15]