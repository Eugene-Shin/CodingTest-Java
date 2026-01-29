import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int N = Integer.parseInt(br.readLine());
            //int[] arr = new int[N];
            int min = 1000000;
            int max = -1000000;
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i = 0; i < N; i++) {
                //arr[i] = Integer.parseInt(st.nextToken());
                //if(arr[i] > max)
                //    max = arr[i];
                //if(arr[i] < min)
                //    min = arr[i];
                int num = Integer.parseInt(st.nextToken());
                if(num > max)
                    max = num;
                if(num < min)
                    min = num;
            }
            bw.write(min + " " + max);
        }
    }
}