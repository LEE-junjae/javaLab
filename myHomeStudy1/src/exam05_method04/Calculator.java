package exam05_method04;

public class Calculator {

	//Field
	//Constructor
	//Method
	int puls(int x , int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = puls(x, y);
		double result = sum / 2;
		return result;
	}
	
	void excute() {
		double result = avg(7, 10);
		println("������: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
