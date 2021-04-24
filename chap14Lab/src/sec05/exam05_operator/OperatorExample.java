package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		/*
		int max = maxOrMin(
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
		*/
		//익명 구현객체를 매개변수로 전달한다.
		int max = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int a, int b) {
				if(a>=b) return a;
				else return b;
			}
		});
		
		int min = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int a, int b) {
				if(a<=b) return a;
				else return b;
			}
			
		});
				
		
	}
}
