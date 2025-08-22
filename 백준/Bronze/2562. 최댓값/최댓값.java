import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 9;
		int[] arr = new int[N];
		int maxNum = Integer.MIN_VALUE;
		int currIdx = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
				currIdx = i + 1;
			}
			
		}
		
		System.out.println(maxNum);
		System.out.println(currIdx);
	}
}