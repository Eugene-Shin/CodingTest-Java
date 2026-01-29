import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] submitted = new boolean[30];
        
        for(int i = 0; i < 28; i++) {
            submitted[sc.nextInt() - 1] = true;
        }
        sc.close();
        
        for(int i = 0; i < 30; i++) {
            if(submitted[i] == false)
                System.out.println(i + 1);
        }
    }
}