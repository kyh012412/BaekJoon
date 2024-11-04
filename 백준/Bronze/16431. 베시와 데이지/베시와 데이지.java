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
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dx = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int jx = Integer.parseInt(st.nextToken());
        int jy = Integer.parseInt(st.nextToken());

        int b,d;

        b = Math.max(Math.abs(bx-jx), Math.abs(by-jy));
        d = Math.abs(dx-jx) + Math.abs(dy-jy);

        if(b<d) {
            bw.write("bessie");
        }else if(b>d) {
            bw.write("daisy");
        }else {
            bw.write("tie");
        }

        bw.close();
        br.close();
    }
}