//풀이시간: 30분 이상...
// 패턴을 찾는게 중요했던거 같다

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[] arr = new int[M];
		for (int i = 0; i < M; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		long N = 1L * arr[0] * arr[M-1]; // 1L: long 타입 숫자 1, 오버플로우방지
		System.out.println(N);
	}
}
