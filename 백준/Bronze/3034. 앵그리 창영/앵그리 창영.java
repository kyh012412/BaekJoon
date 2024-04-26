import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        double limit = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

        for(int i=0;i<n;i++) {
            int num = Integer.parseInt(br.readLine());
            if(num<=limit) {
                bw.write("DA\n");
            }else {
                bw.write("NE\n");
            }
        }

        br.close();
        bw.close();
    }
}