import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for(int tci=0; tci<tc;tci++) {
            int n = Integer.parseInt(br.readLine());
            float total = 0;
            int totala = 0;
            for(int i=0;i<n;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                totala += a;

                float b = Float.parseFloat(st.nextToken());
                total += a*b;
            }
            bw.write(String.format("%d %.1f\n", totala,total/totala));
        }

        br.close();
        bw.close();
    }
}