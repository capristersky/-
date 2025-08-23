import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = arr[N-1];
		
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += (arr[i] * 1.0) / M * 100;
		}
		
		System.out.println(sum / N);
	}

}