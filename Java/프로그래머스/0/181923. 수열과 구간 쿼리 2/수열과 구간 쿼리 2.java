import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int[] query : queries) {
            int[] sortedArr = Arrays.copyOfRange(arr, query[0], query[1] + 1);
            Arrays.sort(sortedArr);
            int i = 0;
            for(; i < sortedArr.length; i++) {
                if(sortedArr[i] > query[2]) {
                    list.add(sortedArr[i]);
                    break;
                }
            }
            if(i >= sortedArr.length)
                list.add(-1);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}