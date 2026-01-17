class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        for (int i : num_list) {
            mul *= i;
            sum += i;
        }
        if (mul < (int)Math.pow(sum, 2)) {
            answer = 1;
        }
        return answer;
    }
}