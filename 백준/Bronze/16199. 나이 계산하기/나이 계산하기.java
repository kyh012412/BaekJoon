import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String v[] = br.readLine().split(" ");
        int y1 = Integer.parseInt(v[0]);
        int m1 = Integer.parseInt(v[1]);
        int d1 = Integer.parseInt(v[2]);

        v = br.readLine().split(" ");
        int y2 = Integer.parseInt(v[0]);
        int m2 = Integer.parseInt(v[1]);
        int d2 = Integer.parseInt(v[2]);

        //년도 - 년도 (생일지나면 +1)
        int man = y2-y1;
        if(m2<m1 || (m2==m1&&d2<d1)) {
            man--;
        }

        int se = y2-y1+1;

        int yeon = y2-y1;

        bw.write(man+"\n");
        bw.write(se+"\n");
        bw.write(yeon+"\n");

        br.close();
        bw.close();
    }
}