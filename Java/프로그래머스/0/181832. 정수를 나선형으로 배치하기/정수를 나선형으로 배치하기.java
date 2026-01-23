class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dy = {0, 1, 0, -1}, dx = {1, 0, -1, 0};
        int y = 0, x = 0;
        
        int i = 0;
        int flag = 1;
        for (int j = 1; j <= n * n; j++) {
            answer[y][x] = j;
            int nextY =  y + dy[i];
            int nextX = x + dx[i];
    
            if (nextX < 0 || nextX == n || nextY < 0 || nextY == n || answer[nextY][nextX] != 0) {
                i = (i + 1) % 4;
                nextX = x + dx[i];
                nextY = y + dy[i];
            }
            
            y = nextY;
            x = nextX;
        }
        
        
        return answer;
    }
}