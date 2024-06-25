import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i=1;i<=(int)Math.sqrt(n);i++) {
//          System.out.println(n/i-(i-1));
            cnt+=n/i-(i-1);
        }

        bw.write(cnt+"");

        br.close();
        bw.close();
    }
}