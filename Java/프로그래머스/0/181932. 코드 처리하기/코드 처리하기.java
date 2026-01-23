class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < code.length(); i++) {
            if(mode == 0 && code.charAt(i) == '1') {
                mode = 1;
            } else if(mode == 0 && code.charAt(i) != '1' && i % 2 == 0) {
                sb.append(code.charAt(i));
            } else if(mode == 1 && code.charAt(i) == '1') {
                mode = 0;
            } else if(mode == 1 && code.charAt(i) != '1' && i % 2 != 0) {
                sb.append(code.charAt(i));
            }
        }
        if(sb.length() == 0)
            sb.append("EMPTY");
        answer = sb.toString();
        return answer;
    }
}