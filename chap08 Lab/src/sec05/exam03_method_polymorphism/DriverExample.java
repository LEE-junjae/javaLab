//실행클래스
package sec05.exam03_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus(); //구현객체
		Taxi taxi = new Taxi(); //구현객체
		
		driver.drive(bus); 
		driver.drive(taxi);
	}
}
