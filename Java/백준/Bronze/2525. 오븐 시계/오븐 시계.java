import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int cookingMinutes = sc.nextInt();
        sc.close();
        
        int nowMinutes = hours * 60 + minutes;
        int totalMinutes = nowMinutes + cookingMinutes;
        
        System.out.printf("%d %d",(totalMinutes / 60) % 24 , totalMinutes % 60);
        
    }
}