import java.io.*;
import java.util.*;

public class Solution {
	public int solution(int[][] routes) {
		Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
		
		int curCameraPos = -30001;
		int camera = 0;
		
		for (int i = 0; i < routes.length; i++) {
			int start = routes[i][0];
			int end = routes[i][1];
			
			if (curCameraPos < start) {
				camera++;
				curCameraPos = end;
			}
		}		
		return camera;
	}
}
