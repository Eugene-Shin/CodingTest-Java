import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i+=2) {
            strArr[i] = strArr[i].toLowerCase();
        }
        for(int i = 1; i < strArr.length; i+=2) {
            strArr[i] = strArr[i].toUpperCase();
        }
        answer = strArr;
        return answer;
    }
}