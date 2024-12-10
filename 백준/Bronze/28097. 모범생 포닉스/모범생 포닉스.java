import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int sum = 0;

        while(st.hasMoreElements()) {
            int num = Integer.parseInt(st.nextToken());
            if(sum!=0) {
                sum += num+8;
            }else {
                sum += num;
            }
        }

        bw.write(sum/24+" "+sum%24);

        bw.close();
        br.close();
    }
}
