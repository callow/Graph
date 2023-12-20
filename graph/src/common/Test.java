package common;

public class Test {

	public static void main(String[] args) {
		
		int[] move = { -1, 0, 1, 0, -1 };
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i + " " + move[i] + " " + move[i + 1]);
		
		}
	}
}
