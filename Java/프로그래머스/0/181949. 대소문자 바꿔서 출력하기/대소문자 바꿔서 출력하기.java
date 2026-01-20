import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char c : a.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                c = Character.toUpperCase(c);
            } else if(c >= 'A' && c <= 'Z') {
                c = Character.toLowerCase(c);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}