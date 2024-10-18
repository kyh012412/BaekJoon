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

        st = new StringTokenizer(br.readLine());

        int f = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());

        bw.write(f-s+"");

        bw.close();
        br.close();
    }
}