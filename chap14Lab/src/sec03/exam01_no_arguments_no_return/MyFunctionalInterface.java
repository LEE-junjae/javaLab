package sec03.exam01_no_arguments_no_return;

//함수적 인터페이스:추상 메소드가 하나인 겨이우를 말한다.
@FunctionalInterface //인터페이스에 메소드가 몇개 있는지 확인하고 두개 이상이면 컴파일 오류가 난다.
public interface MyFunctionalInterface {
    public void method();
    //public void method2(); @FunctionalInterface 한개 이상의 메소드를 검사하는 방법 
}

