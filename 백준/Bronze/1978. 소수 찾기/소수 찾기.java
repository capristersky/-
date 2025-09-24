import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		// 입력받기
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			int x = arr[i];

			// 0 과 1은 소수아니니까 건너뛰기
			if (x < 2) continue;

			boolean isPrime = true;
			
			for (int j = 2; j * j <= x; j++) {
				if (x % j == 0) {
					// 2부터 나눌건데 나누어지면 소수가 아니므로 바로 아웃
					isPrime = false;
					break;
				}
			}
			// 소수이면 갯수 더하기
			if (isPrime) count++;
		}
		System.out.println(count);
	}
}
