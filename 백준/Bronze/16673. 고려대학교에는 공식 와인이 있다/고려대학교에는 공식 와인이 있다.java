import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String v[] = br.readLine().split(" ");

        long c = Long.parseLong(v[0]);
        long k = Long.parseLong(v[1]);
        long p = Long.parseLong(v[2]);

        long ans = 0;
        for(int i=1;i<c+1;i++) {
            ans += k*i + p*i*i;
        }
        bw.write(ans + "");

        br.close();
        bw.close();
    }
}