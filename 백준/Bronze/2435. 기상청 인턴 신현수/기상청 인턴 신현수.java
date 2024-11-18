import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     

        int n,k;

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int a[] = new int[n];
        long sum = 0;
        long max = Integer.MIN_VALUE;
        int count =0;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++) {
            if(count != k) {
                sum += a[i];
                count++;
            }
            if(count==k) {
                if(max<sum) {
                    max=sum;
                }
                sum -=a[i-k+1];
                count--;
            }
        }

        bw.write(max+"");

        bw.close();
        br.close();
    }
}