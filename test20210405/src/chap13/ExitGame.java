package chap13;

import java.util.Scanner;
public class ExitGame {
public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ 5�� �Է��ϼ���.");
		int sum=0;
		for(int i=0; i<5; i++) {
		int n = scanner.nextInt(); 
		if(i<=100)
		continue;
		else
		sum += n;
		}
		System.out.println("����� ���� " + sum);
		scanner.close();
		
		
	}

}
