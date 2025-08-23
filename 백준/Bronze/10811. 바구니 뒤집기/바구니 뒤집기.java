import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] basket = new int[N];
		
		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}
		
		for (int idx = 0; idx < M; idx++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int left = i - 1;
			int right = j -1;
			while (left < right) {
				int tmp = basket[left];
				basket[left] = basket[right];
				basket[right] = tmp;
				left++;
				right--;
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(basket[i] + " ");
		}
		
	}
}