import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int num = sc.nextInt();
        int count = 0;
        
        sc.close();
        
        for(int i : arr) {
            if(i == num) count++;
        }
        
        System.out.println(count);
    }
}