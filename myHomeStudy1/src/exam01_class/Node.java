package exam01_class;

public class Node { //Node 게임세계의 좌표를 뜻함. ex : a = (3,7) b=(5,12)
	
	private int x; //private 형태는 보안을 위해 사용 (외부에서 함부로 접근못하게 설정을 함)
	private int y;
	
	public int getX() { //(외부에서 접근할수 있게 할려면 public 사용)
		return x;  // x를 반환할수 있도록 만듬
	}
	
	public void setX(int x) { //자신이 가지고있는 x,y 값을 변경할때 사용
		this.x = x; //변수에 값을 변경할때 set , get 을 사용함
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}

}
