class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()) {
            sb.append(c == 'A' ? 'B' : 'A');
        }
        String str = sb.toString();
        if (str.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}