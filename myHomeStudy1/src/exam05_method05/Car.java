package exam05_method05;

public class Car {
	//Field
	int speed;
	
	//Constructor
	
	//Method
	int getSpeed() {
		return speed;
		
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:	 +" + speed + "km/h");
		}
	}

}
