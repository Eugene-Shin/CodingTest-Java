class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dy = {0, 1, 0, -1}, dx = {1, 0, -1, 0};
        int y = 0, x = 0;
        
        int i = 0;
        for(int j = 1; j <= n * n; j++) {
            answer[y][x] = j;
            
            y += dy[i];
            x += dx[i];
            
            if(y < 0 || x < 0 || y == n || x == n || answer[y][x] != 0) {
                y -= dy[i];
                x -= dx[i];
                i = (i + 1) % 4;
                y += dy[i];
                x += dx[i];
            }
        }
        
        return answer;
    }
}