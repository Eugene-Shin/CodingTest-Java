import java.math.BigDecimal;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigDecimal x = new BigDecimal(a);
        BigDecimal y = new BigDecimal(b);
        answer = x.add(y).toString();
        return answer;
    }
}