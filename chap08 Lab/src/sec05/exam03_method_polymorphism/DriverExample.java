//����Ŭ����
package sec05.exam03_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus(); //������ü
		Taxi taxi = new Taxi(); //������ü
		
		driver.drive(bus); 
		driver.drive(taxi);
	}
}
