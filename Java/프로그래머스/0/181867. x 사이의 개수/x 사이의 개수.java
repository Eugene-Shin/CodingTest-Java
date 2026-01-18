import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        int flag = 0;
        if(myString.charAt(myString.length()-1) == 'x')
            flag = 1;
        List<Integer> list = new ArrayList<>();
        String arr[] = myString.split("x");
        for(String s : arr) {
            list.add(s.length());
        }
        if(flag == 1)
            list.add(0);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}