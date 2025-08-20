import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int N = sc.nextInt();
		int[] price = new int[N];
		int[] qty = new int[N];
		
		int sum = 0;

		for (int i = 0; i < N; i++) {
			price[i] = sc.nextInt();
			qty[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			sum += price[i] * qty[i];
		}
		
		System.out.println(total == sum ? "Yes" : "No");
	}
}