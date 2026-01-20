class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int fromIndex = 0;
        while(myString.length() - fromIndex >= pat.length()) {
            int index = myString.indexOf(pat, fromIndex);
            if(index == -1)
                break;
            answer++;
            fromIndex = index + 1;
        }
        return answer;
    }
}