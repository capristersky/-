import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		int[] letters = new int[26];
		
		for (int i = 0; i < letters.length; i++) {
			letters[i] = -1;
		}
		
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			int index = c - 'a';
			if (letters[index] == -1) {
				letters[index] = i;
			}
		}
		
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + " ");
		}
	}
}