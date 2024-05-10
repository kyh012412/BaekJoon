import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long ans = 0;

        for(long i=1;i<n;i++) {
            long temp = n*i+i;
//          if(temp%n==i)
            ans+=temp;
        }

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}