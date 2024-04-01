import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String v[] = br.readLine().split(" ");

        int s,t,d;

        s = Integer.parseInt(v[0]);
        t = Integer.parseInt(v[1]);
        d = Integer.parseInt(v[2]);

        int ans =d/2/s*t;
        bw.write(ans+"");

        br.close();
        bw.close();
    }
}  