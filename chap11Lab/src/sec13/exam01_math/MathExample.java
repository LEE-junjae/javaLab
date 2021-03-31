package sec13.exam01_math;

public class MathExample {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3="+v3); //6.0
		System.out.println("v4="+v4); //-5.0
		
		double v5 = Math.ceil(5.3);
		double v6 = Math.ceil(-5.3);
		System.out.println("v5="+v5); //5.0
		System.out.println("v6="+v6); //-6.0
		
		double v11 = Math.random(); // 0.0<=Math.random()<1.0사이의 랜덤 실수
		System.out.println("v11="+v11);
		
		long v14 = Math.round(5.3); //5
		long v15 = Math.round(5.7); //6
		System.out.println("v14="+v14);
		System.out.println("v15="+v15);
		
	}

}
