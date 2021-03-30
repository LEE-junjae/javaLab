package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = new int[3];
		System.out.println("ints.length="+ints.length);
		
		String ssn = "7306241230123";
		int length = ssn.length(); //메소드 호출한다.
		if(length==13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}

	}

}
