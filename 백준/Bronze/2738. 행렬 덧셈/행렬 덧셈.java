import java.util.Scanner;

class Main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] map1 = new int [N][M];
		int[][] map2 = new int [N][M];
		int[][] map3 = new int [N][M];
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map1[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map2[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map3[i][j] = map1[i][j] + map2[i][j];
				System.out.print(map3[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
