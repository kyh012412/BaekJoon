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

        st = new StringTokenizer(br.readLine());

        int max=0;
        int sum=0;
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            if(max<num) {
                max=num;
            }
        }

        bw.write(sum-max+"");

        bw.close();
        br.close();
    }
}