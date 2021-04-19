//구현클래스
package sec07.exam01_why_default_method;

public class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	@Override
	public void method2() { //구현클래스에서 재정의시 디폴트 메소드 사용시 반드시 디폴트 단어는 빼야된다
		System.out.println("MyClassB-method2() 실행");
	}
}
