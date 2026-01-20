import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int idx = 0;
        List<String> list = new ArrayList<>();
        for(String s : str_list) {
            if(s.equals("l")) {
                for(int i = 0; i < idx; i++) {
                    list.add(str_list[i]);
                }
                break;
            } else if(s.equals("r")) {
                for(int i = idx + 1; i < str_list.length; i++) {
                    list.add(str_list[i]);
                }
                break;
            }
            idx++;
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}