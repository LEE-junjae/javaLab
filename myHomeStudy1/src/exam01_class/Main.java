package exam01_class;

public class Main {

	public static void main(String[] args) {

		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two); //one��two�� ���Ϳ��� ���ϴ°� ��Ÿ��
		System.out.println("x : " + result.getX() + ", y : " + result.getY()); //one��two�� result�� ��ܼ� �����
		
	}

}
