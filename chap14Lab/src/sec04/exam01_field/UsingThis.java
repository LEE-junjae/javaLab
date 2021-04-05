package sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;

	// 인스턴스 멤버 클래스
	class Inner {
		int innerField = 20;

		void method() {
			//람다식
			MyFunctionalInterface fi= () -> {
				System.out.println("outterField: " + outterField); // outterField:10
				System.out.println("outterField: " + UsingThis.this.outterField + "\n"); //outterField: 10 (UsingThis.this는 밖의 객체
				
				System.out.println("innerField: " + innerField); //innerField:20
				System.out.println("innerField: " + this.innerField + "\n");// this는 안쪽객체
			};
			fi.method();
		}
	}
}

