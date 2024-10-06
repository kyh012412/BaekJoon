import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int n,r,c;
    public static int[][] map;

    public static int getInt(int tr,int tc) {
        int sum =0;

        while(tr>=2 || tc>=2) {
            sum += 4*getInt(tr/2,tc/2);
            tr%=2;
            tc%=2;
        }

        sum += tr==0?0:2;
        sum += tc==0?0:1;
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new int[n][n];

        System.out.println(getInt(r, c));

        bw.close();
        br.close();
    }
}