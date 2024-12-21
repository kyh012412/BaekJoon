import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(n-->0) {
            st = new StringTokenizer(br.readLine(),"-");
            st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(num<=90) {
                count++;
            }
        }

        bw.write(count+"");

        bw.close();
        br.close();
    }
}