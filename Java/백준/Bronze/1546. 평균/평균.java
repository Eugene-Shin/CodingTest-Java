import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];
        double average = 0.0;
        double max = 0.0;
        
        for(int i = 0; i < N; i++) {
            score[i] = (double)sc.nextInt();
            if(score[i] > max)
                max = score[i];
        }
        for(int i = 0; i < N; i++) {
            score[i] = score[i] / max * 100.0;
        }
        for(double d : score) {
            average += d;
        }
        average /= (double)N;
        System.out.println(average);
    }
}