package exam07_00;

public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;
		double avg;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	
	System.out.println("1부터 100까지의 합 = " + sum);
	System.out.println("1부터 100까지의 평균 = " + sum/100.0);
	
}

}