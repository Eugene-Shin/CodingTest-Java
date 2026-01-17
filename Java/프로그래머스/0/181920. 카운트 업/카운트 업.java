import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        
        List<Integer> newList = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            newList.add(i);
        }
        answer = newList.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        return answer;
    }
}