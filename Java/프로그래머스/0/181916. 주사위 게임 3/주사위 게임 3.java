class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[6];
        count[a - 1]++;
        count[b - 1]++;
        count[c - 1]++;
        count[d - 1]++;
        
        for(int i = 0; i < 6; i++) {
            if(count[i] == 4)
                return 1111 * (i + 1);
        }
        for(int i = 0; i < 6; i++) {
            if(count[i] == 3) {
                for(int j = 0; j < 6; j++) {
                    if(count[j] == 1)
                        return (10 * (i + 1) + (j + 1))*(10 * (i + 1) + (j + 1));
                }
            }
        }
        
        for(int i = 0; i < 6; i++) {
            if(count[i] == 2){
                for(int j = 0; j < 6; j++) {
                    if(i != j && count[j] == 2)
                        return ((i + 1) + (j + 1))*(int)Math.abs(i - j);
                    else if(count[j] == 1) {
                        for(int k = 0; k < 6; k++) {
                            if(count[k] == 1 && j != k)
                                return (j + 1)*(k + 1);
                        }
                    }
                }
            }
        }
        
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}