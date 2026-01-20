import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        int size = 1;
        while(size < len) {
            size <<= 1;
        }
        answer = Arrays.copyOf(arr, size);
        return answer;
    }
}