package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택번호:");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호:");
		for(int i=0; i<6; i++) {
			// (int)(Math.random()*45) + 1
			winningNumber[i] = random.nextInt(45) + 1; //1~45 사이의 임의의 정수
			System.out.print(winningNumber[i] + " ");
		}

	}

}
