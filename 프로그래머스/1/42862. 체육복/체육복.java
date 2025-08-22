class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n+2];
        
        // 일단 전원 체육복 1개씩 있다고 시작
        for (int i = 1; i <= n; i++) {
            clothes[i] = 1;
        }
        
        // 도난 -1
        for (int x : lost) {
            clothes[x]--;
        }
        
        // 여벌 +!
        for (int x : reserve) {
            clothes[x]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (clothes[i] == 0) {
                // 왼쪽 친구가 여벌이 있는지 확인하고 있다면 빌리기
                if (clothes[i-1] == 2) {
                    clothes[i-1]--;
                    clothes[i]++;
                }
                // 왼쪽 친구한테 못빌렸으면 오른쪽 츄라이~
                else if (clothes[i+1] == 2) {
                    clothes[i+1]--;
                    clothes[i]++;
                }
                // 양쪽 친구다 여벌이 없었다면 그대로 0
            }
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (clothes[i] >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}