import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            if(String.valueOf(i).matches("[05]+")) {
                list.add(i);
            }
        }
        
        if(list.size() == 0)
            answer = new int[]{-1};
        else {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}