import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int val = 0;
            val += Integer.parseInt(st.nextToken());
            val *= 60;
            val += Integer.parseInt(st.nextToken());
            val *= 60;
            val += Integer.parseInt(st.nextToken());

            int val2 = 0;
            val2 += Integer.parseInt(st.nextToken());
            val2 *= 60;
            val2 += Integer.parseInt(st.nextToken());
            val2 *= 60;
            val2 += Integer.parseInt(st.nextToken());

            int gap = val2 - val;

            int ansh = gap / 3600;
            gap %= 3600;
            int ansm = gap / 60;
            int anss = gap % 60;

            bw.write(ansh + " " + ansm + " " + anss + "\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}