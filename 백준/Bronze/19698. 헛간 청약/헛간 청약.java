import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String v[] = br.readLine().split(" ");

        int n = Integer.parseInt(v[0]);
        int w = Integer.parseInt(v[1]);
        int h = Integer.parseInt(v[2]);
        int l = Integer.parseInt(v[3]);

        w/=l;
        h/=l;

        int avail=w*h;
        bw.write((n>avail?avail:n)+"");

        br.close();
        bw.close();
    }
}