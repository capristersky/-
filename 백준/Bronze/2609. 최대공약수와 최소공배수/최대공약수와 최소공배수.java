import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 입력: 한 줄에서 정수 2개 읽기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// 2. 최대공약수 (GCD) 구하기 - 완탐
		int limit = Math.min(a, b);
		int gcd = 1; // 최소 1은 항상 공약수
		for (int i = 1; i <= limit; i++) {
			// 둘 다 나눠지면 i는 공약수
			if (a % i == 0 && b % i == 0) {
				gcd = i; // 현재까지의 최대 공약수 (for문이 돌아가면서 알아서 최대로 갱신됨)
			}
		}
		
		// 3. 최소공배수 (LCM) = (a*b) / gcd
		int lcm = (a*b) / gcd;
		
		// 출력
		System.out.println(gcd + "\n" + lcm);
	}
}
