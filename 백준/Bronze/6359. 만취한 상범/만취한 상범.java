import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for(int tci=0;tci<tc;tci++) {
            int num = Integer.parseInt(br.readLine());
            int ans = (int) Math.sqrt(num);
            bw.write(ans+"\n");
        }

        br.close();
        bw.close();
    }
}