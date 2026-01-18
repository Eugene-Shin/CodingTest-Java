import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        int lastEmt = list.get(list.size() - 1);
        int nextLastEmt = list.get(list.size() - 2);
        list.add(lastEmt > nextLastEmt ? lastEmt - nextLastEmt : 2 * lastEmt);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}