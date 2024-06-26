import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String v[] = br.readLine().split(" ");
        int ans = 0;

        for(int i=0;i<v.length;i++) {
            if(i+1 != Integer.parseInt(v[i]))
                ans++;
        }

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}