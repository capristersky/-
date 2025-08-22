import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] basket = new int[N+1];
		
		int M = sc.nextInt();
		
		for (int idx = 0; idx < M; idx++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for (int idx2 = i; idx2 <= j; idx2++) {
				basket[idx2] = k;
			}
		}

		for (int i = 1; i <= N; i++) {
			System.out.print(basket[i] + " ");
		}
	}
}