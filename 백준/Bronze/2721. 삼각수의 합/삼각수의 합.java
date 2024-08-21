import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 

    public static long cal(int ln) {
        long n = ln;
        long v = n*(n+1)/2;

        long ans = v*v +v*(2*n+1) + 2*v;
        ans /= 2;

        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for(int i=0;i<tc;i++) {
            int ln = Integer.parseInt(br.readLine());
            long val = cal(ln);
            bw.write(val+"\n");
        }

        br.close();
        bw.close();
    }
}