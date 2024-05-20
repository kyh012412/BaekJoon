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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count=0;

        int want = 0;
        while(st.hasMoreTokens()) {
            int offered = Integer.parseInt(st.nextToken());
            if(offered==want) {
                count++;

                want++;
                want %=3;
            }
        }
        bw.write(count+"");

        br.close();
        bw.close();
    }
}