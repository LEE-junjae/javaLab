package exam07_exam01;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "copy", "array"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println();
		
		newStrArray[3] = "È«±æµ¿";
		newStrArray[4] = "±èÀÚ¹Ù";
		for(int i=0; i<newStrArray.length; i++) {
		System.out.print(newStrArray[i] + ", ");
		}
		
	}
		
}