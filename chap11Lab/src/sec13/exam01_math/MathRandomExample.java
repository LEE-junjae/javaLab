package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		//0.0<= Math.random() <1.0 사이의 임의의 실수값 생성
		int num = (int)(Math.random()*6) + 1; // 1~6사이의 임의의 정수 생성
		System.out.println("주사위 눈:"+num);
	}

}
