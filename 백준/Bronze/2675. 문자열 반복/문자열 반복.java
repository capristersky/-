import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int tc = 0; tc < T; tc++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for (int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				for (int j = 0; j < R; j++) {
					sb.append(c);
				}
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}