package exam01_class;

public class Node { //Node ���Ӽ����� ��ǥ�� ����. ex : a = (3,7) b=(5,12)
	
	private int x; //private ���´� ������ ���� ��� (�ܺο��� �Ժη� ���ٸ��ϰ� ������ ��)
	private int y;
	
	public int getX() { //(�ܺο��� �����Ҽ� �ְ� �ҷ��� public ���)
		return x;  // x�� ��ȯ�Ҽ� �ֵ��� ����
	}
	
	public void setX(int x) { //�ڽ��� �������ִ� x,y ���� �����Ҷ� ���
		this.x = x; //������ ���� �����Ҷ� set , get �� �����
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
