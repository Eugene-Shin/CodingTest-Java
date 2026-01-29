import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int num = sc.nextInt();
            for(int j = from - 1; j < to; j++) {
                arr[j] = num;
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i]);
            if(i < N - 1)
                System.out.print(" ");
        }
    }
}