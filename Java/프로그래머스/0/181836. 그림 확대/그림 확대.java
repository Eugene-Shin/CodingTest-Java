import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(String s : picture) {
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()) {
                for(int i = 0; i < k; i++) {
                    sb.append(c);
                }
            }
            for(int i = 0; i < k; i++) {
                list.add(sb.toString());
            }
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}