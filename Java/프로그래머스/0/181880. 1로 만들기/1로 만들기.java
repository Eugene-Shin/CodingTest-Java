class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i : num_list) {
            int count = 0;
            while(i != 1) {
                if(i % 2 != 0) {
                    i--;
                }
                i /= 2;
                count++;
            }
            answer += count;
        }
        return answer;
    }
}