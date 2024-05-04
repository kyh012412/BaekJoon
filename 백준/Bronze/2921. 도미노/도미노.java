import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        long ans = 0;

        for(int i=0;i<n+1;i++) {
            for(int j=i;j<n+1;j++) {
                ans = ans + i + j;
            }
        }

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}