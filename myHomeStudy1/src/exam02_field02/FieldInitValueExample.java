package exam02_field02;

public class FieldInitValueExample {

	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();
		System.out.println(fiv.byteField); //�ʱⰪ0
		System.out.println(fiv.charField); //�ʱⰪ (�����)
		System.out.println(fiv.shortField); //�ʱⰪ0
		System.out.println(fiv.intField); //�ʱⰪ0
		System.out.println(fiv.longField); //�ʱⰪ0
		
		System.out.println(fiv.floatField); //�Ǽ�Ÿ�� �ʱⰪ 0.0
		System.out.println(fiv.doubleField); //�Ǽ�Ÿ�� �ʱⰪ 0.0 //�Ǽ��� 0(��0�� ������ ���� ex:�Ҽ���ǥ�⸦ �Ǽ�����Ѵ�.)
		
		System.out.println(fiv.booleanField); //�ʱⰪ false
		
		System.out.println(fiv.arrField); //����Ÿ�� �ʱⰪ null
		System.out.println(fiv.strField); //����Ÿ�� �ʱⰪ null
		
	}

}
