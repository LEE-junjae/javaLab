package exam07_exam01;

public class Exercise {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3�� ����� ��="+sum);
	}
}
