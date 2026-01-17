class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt("" + a + b);
        int mul = 2 * a * b;
        answer = ab >= mul ? ab : mul;
        return answer;
    }
}