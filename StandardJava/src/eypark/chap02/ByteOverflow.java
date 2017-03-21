package eypark.chap02;

public class ByteOverflow {
	public static void main(String[] args) {
		byte b = 0;//범위가 -128 ~ 127
		int i = 0;
		
		for (int x = 0; x <= 270; x++) {
			System.out.print(b++);
			System.out.print('\t');
			System.out.println(i++);
		}
	}
}
