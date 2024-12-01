import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        while(tc-->0) {
            br.readLine();
            int n = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for(int i=0;i<n;i++) {
                sum = sum.add(new BigInteger(br.readLine()));
            }

            if(sum.remainder(BigInteger.valueOf(n)).equals(BigInteger.ZERO)) {
                ans.append("YES\n");
            }else {
                ans.append("NO\n");
            }
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}