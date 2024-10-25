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

        String v[] = new String[n];

        for(int i=0;i<n;i++) {
            v[i] =br.readLine();
        }

        switch(Integer.parseInt(br.readLine())) {
        case 1:
            for(int i=0;i<n;i++) {
                ans.append(v[i]+"\n");
            }
            break;
        case 2:
            for(int i=0;i<n;i++) {
                sb.setLength(0);
                sb.append(v[i]);
                ans.append(sb.reverse().toString()+"\n");
            }
            break;
        case 3:
            for(int i=n-1;i>=0;i--) {
                ans.append(v[i]+"\n");
            }
            break;
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}