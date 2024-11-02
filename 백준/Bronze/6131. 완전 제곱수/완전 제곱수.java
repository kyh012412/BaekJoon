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
        int a=500;
        int count=0;
        while(a>=1) {
            int b=a;
            while(b>=1) {
                if(a*a==b*b+n) count++;
                b--;
            }
            a--;
        }

        bw.write(count+"");

        bw.close();
        br.close();
    }
}