import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        if(arr.length > arr[0].length) {//행 > 열
            answer = new int[arr.length][];
            for(int i = 0; i < arr.length; i++) {
                answer[i] = Arrays.copyOf(arr[i], arr.length);
            }
        } else if(arr.length < arr[0].length) {
            answer = new int[arr[0].length][];
            for(int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }
            for(int i = arr.length; i < arr[0].length; i++) {
                answer[i] = new int[arr[0].length];
            }
        } else {
            answer = arr;
        }
        return answer;
    }
}