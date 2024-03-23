import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String v[] = br.readLine().split(" ");
        int a = Integer.parseInt(v[0]);
        int b = Integer.parseInt(v[1]);
        int c = Integer.parseInt(v[2]);
        int ans =0;
        ans += (a<n)?a:n;
        ans += (b<n)?b:n;
        ans += (c<n)?c:n;
        bw.write(ans+"");

        br.close();
        bw.close();
    }
}