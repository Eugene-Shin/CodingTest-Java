import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i >= 50 && i % 2 == 0) {
                list.add(i / 2);
            } else if(i < 50 && i % 2 != 0) {
                list.add(i * 2);
            } else {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}