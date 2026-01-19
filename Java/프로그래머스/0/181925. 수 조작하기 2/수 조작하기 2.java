class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int sub = 0;
        for(int i = 0; i < numLog.length - 1; i++) {
            sub = numLog[i + 1] - numLog[i];
            if(sub == 1)
                sb.append("w");
            else if(sub == -1)
                sb.append("s");
            else if(sub == 10)
                sb.append("d");
            else if(sub == -10)
                sb.append("a");
        }
        answer = sb.toString();
        return answer;
    }
}