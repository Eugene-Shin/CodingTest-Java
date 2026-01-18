import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int[] interval : intervals) {
            for(int i : Arrays.copyOfRange(arr, interval[0], interval[1] + 1)) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}