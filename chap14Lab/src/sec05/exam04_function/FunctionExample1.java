package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	//List 자료구조 = 자료를 인덱스로 관리하는 배열과 비슷하지만 확장을 할 수 있다.
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	);
	
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		
		/*
		// 익명객체를 매개변수에 대입한다.
		printString(new Function<Student,String>(){

			@Override
			public String apply(Student t) {
				// TODO Auto-generated method stub
				return t.getName();
			}
			
		};
		*/
		
		//람다식으로 매개변수에 대입한다.
		printString( t -> t.getName() ); //"홍길동 신용권"출력이됨
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() );
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
	}
}
