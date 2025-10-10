import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	// 유클리드 호제법을 이용한 최대공약수 (GCD) 함수
	// 두 숫자를 번갈아 가며 나누고 나머지를 구하는 과정을 반복
	// 두 정수 a와 b (a>b)가 있을 때, a와 b의 최대공약수는 
	// b와 a를 b로 나눈 **나머지**의 최대공약수와 같다.
	public static int gcd(int a, int b) {
		while (b != 0) { 		// 나누는 수 b가 0이 아닐때까지 반복
			int temp = a % b;	// 나머지 구하기
			a = b;				// 나누는 수 b를 새로운 a로 만듬
			b = temp;			// 나머지를 새로운 b로 만듬
		}
		return a;	// 나머지가 0일때 나누는 수 a를 반환
	}
	
	public static void main(String[] args) throws Exception {
		
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		// 입력 받기 
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		 
		// 인접한 가로수 간의 간격(diff) 배열 계산
		int[] diff = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			diff[i] = arr[i + 1] - arr[i];
		}
		
		// 찾아낸 간격들을 모두 나눌 수 있는 가장 큰숫자 찾기 -> 최대공약수 (GCD) 계산
		// 제 각각인 간격을 다 똑같은 간격으로 만들어 주려면 간격들을 모두 나눌수 있는 가장 큰숫자를 찾아야 함
		int commonGCD = diff[0];
		for (int i = 0; i < N - 1; i++) {
			commonGCD = gcd(commonGCD, diff[i]);
		}
		
		// 심어야 할 나무 최소갯수 계산
		int totalTrees = 0;
		for (int i = 0; i < diff.length; i++) {
			int d = diff[i]; // 배열의 i번째 원소를 가져옴
			totalTrees += (d / commonGCD) - 1;
			// 필요한 총 가로등 자리의 개수 - 이미 있는 가로수 1개
		}
		
		System.out.println(totalTrees);
	}
}
