import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static boolean check(String str) {
        char ch1=str.charAt(str.length()/2-1);
        char ch2 =str.charAt(str.length()/2);

        return ch1==ch2;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while(n-->0) {
            ans.append(check(br.readLine())?"Do-it":"Do-it-Not");
            ans.append("\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}