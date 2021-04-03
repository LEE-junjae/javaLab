package exam02_field02;

public class FieldInitValueExample {

	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();
		System.out.println(fiv.byteField); //초기값0
		System.out.println(fiv.charField); //초기값 (빈공백)
		System.out.println(fiv.shortField); //초기값0
		System.out.println(fiv.intField); //초기값0
		System.out.println(fiv.longField); //초기값0
		
		System.out.println(fiv.floatField); //실수타입 초기값 0.0
		System.out.println(fiv.doubleField); //실수타입 초기값 0.0 //실수란 0(즉0을 제외한 모든수 ex:소수점표기를 실수라고한다.)
		
		System.out.println(fiv.booleanField); //초기값 false
		
		System.out.println(fiv.arrField); //참조타입 초기값 null
		System.out.println(fiv.strField); //참조타입 초기값 null
		
	}

}
