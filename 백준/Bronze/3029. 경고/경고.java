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
        st= new StringTokenizer(str,":");
        sum += Integer.parseInt(st.nextToken());
        sum*=60;
        sum += Integer.parseInt(st.nextToken());
        sum*=60;
        sum += Integer.parseInt(st.nextToken());
        return sum;
    }

    public static String getString(int diff) {
        sb.setLength(0);
        sb.append(String.format("%02d", diff/3600));
        sb.append(":");

        sb.append(String.format("%02d", (diff%3600)/60));
        sb.append(":");
        sb.append(String.format("%02d", diff%60));

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = getInt(br.readLine());
        int b = getInt(br.readLine());

        if(a<b) {
            bw.write(getString(b-a));
        }else {
            int day1 = getInt("24:00:00");
            bw.write(getString(day1-a+b));
        }

        bw.close();
        br.close();
    }
}