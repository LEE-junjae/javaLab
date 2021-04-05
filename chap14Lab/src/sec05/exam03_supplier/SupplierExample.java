package sec05.exam03_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		//익명구현객체
		IntSupplier intSupplier = new IntSupplier() {

			@Override
			public int getAsInt() {
				int num = (int) (Math.random() * 6) + 1;
				return num;
			}
			
		};
		
		
		//람다식
		intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt(); //1~6의 임의의 정수를 발생시킨다.
		System.out.println("눈의 수: " + num);
	}
}
