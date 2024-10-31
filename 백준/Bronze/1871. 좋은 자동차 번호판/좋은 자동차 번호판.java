import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int getInt(String str) {
        int sum=0;

        for(int i=0;i<3;i++) {
            char ch = str.charAt(i);
            int value = ch-'A';
            int times = 2-i;
            sum += value * Math.pow(26, times);
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        while(tc-->0) {
            st = new StringTokenizer(br.readLine(),"-");
            int f = getInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            ans.append(Math.abs(f-s)<=100?"nice":"not nice");
            ans.append("\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}