import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] basket = new int[N];

		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}
		
		int M = sc.nextInt();
		
		for (int idx = 0; idx < M; idx++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			// 스왑
			int tmp = basket[i - 1];
			basket[i - 1] = basket[j - 1];
			basket[j - 1] = tmp;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(basket[i] + " ");
		}
	}
}