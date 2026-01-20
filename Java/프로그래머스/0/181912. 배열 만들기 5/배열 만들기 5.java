import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int n = 0;
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs) {
            n = Integer.parseInt(str.substring(s, s + l));
            if(n > k) {
                list.add(n);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}