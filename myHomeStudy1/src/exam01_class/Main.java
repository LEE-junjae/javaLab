package exam01_class;

public class Main {

	public static void main(String[] args) {

		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two); //one과two를 센터에서 비교하는걸 나타냄
		System.out.println("x : " + result.getX() + ", y : " + result.getY()); //one과two가 result에 담겨서 출력함
		
	}

}
