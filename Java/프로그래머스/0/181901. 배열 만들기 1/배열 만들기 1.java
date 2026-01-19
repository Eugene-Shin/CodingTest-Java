import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        if (n >= k)
            for(int i = k; i <= n; i+=k)
                list.add(i);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}