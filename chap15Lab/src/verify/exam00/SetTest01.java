package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {

		int n;
		Set s = new HashSet();
		//TreeSet s = new TreeSet(); //(TreeSet)���� �����ϴ� ���
		
		Random r = new Random();
		
		//�ۼ���ġ
		//set�� �̿��� �ζ� ���α׷�
		
		while (s.size() != 6)
			s.add(r.nextInt(45) + 1);
		System.out.println(s);
		/*
		������ -����-
		while (s.size() != 6) {
			n = r.nextInt(45) + 1; // 1~45 ����������
			s.add(n);
		}
		
		System.out.println(s);
		*/
		
		//set -> list �����Ͽ� Collection.sort()�� �̿��Ͽ� �����Ѵ�.
		
		/*
		List list = new ArrayList(s);
		Collection.sort(list);
		
		System.out.println(s);
		System.out.println(list);
		*/
	}
}

// ���� ���
// [7, 41, 25, 27, 29, 15]