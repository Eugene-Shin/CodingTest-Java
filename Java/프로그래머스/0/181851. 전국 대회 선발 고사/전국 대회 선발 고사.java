import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i] == true) {
                list.add(i);
            }
        }
        list.sort((a, b) -> rank[a] - rank[b]);
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        
        return 10000*a + 100*b + c;
    }
}