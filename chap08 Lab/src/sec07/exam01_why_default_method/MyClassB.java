//����Ŭ����
package sec07.exam01_why_default_method;

public class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() ����");
	}
	
	@Override
	public void method2() { //����Ŭ�������� �����ǽ� ����Ʈ �޼ҵ� ���� �ݵ�� ����Ʈ �ܾ�� ���ߵȴ�
		System.out.println("MyClassB-method2() ����");
	}
}
