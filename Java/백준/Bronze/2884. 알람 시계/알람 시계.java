import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        sc.close();
        
        if(minutes < 45) {
            hours = (hours + 23) % 24;
        }
        
        minutes = (minutes + 15) % 60;
        
        System.out.printf("%d %d", hours, minutes);
    }
}