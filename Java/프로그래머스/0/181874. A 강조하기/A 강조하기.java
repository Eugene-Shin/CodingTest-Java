import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()) {
            if(c == 'a' || c == 'A')
                sb.append(Character.toUpperCase(c));
            else
                sb.append(Character.toLowerCase(c));
        }
        answer = sb.toString();
        return answer;
    }
}