class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int[] query : queries) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < query[0]; i++) {
                sb.append(my_string.charAt(i));
            }
            for(int i = query[1]; i >= query[0]; i--) {
                sb.append(my_string.charAt(i));
            }
            for(int i = query[1] + 1; i < my_string.length(); i++) {
                sb.append(my_string.charAt(i));
            }
            my_string = sb.toString();
        }
        answer = my_string;
        return answer;
    }
}