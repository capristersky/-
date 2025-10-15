import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[] parent;
	
	public static int findSet(int x) {
		if(parent[x] == x) {
			return x;
		}
		
		// 재귀호출로 부모를 통해 다시 대표자 탐색 진행
		return parent[x] = findSet(parent[x]);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 대표자를 가리키는 parent 배열
		parent = new int[n + 1];
		
		// 나 자신을 부모로 가리키도록 초기화
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int root_a = findSet(a);
			int root_b = findSet(b);

			if (num == 0) {
				if (root_a != root_b) {
					parent[root_a] = root_b;
				}
			} else if (num == 1) {
				if (root_a == root_b) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			
		}
		
	}
}
