package exam07_exam01;

public class ForMultiplicationTable {

	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.print(m + "´Ü" + "\t"); 
		}
		System.out.println();
		
		for(int n=1; n<=9; n++) {
			for(int m=2; m<=9; m++) {
				System.out.print(m + "*" + n + "=" + (m*n) + "\t");
			}
			System.out.println();
		}
	}
}