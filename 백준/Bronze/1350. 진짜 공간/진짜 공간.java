import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String v[] = br.readLine().split(" ");
        long cluster = Integer.parseInt(br.readLine());
        long cnt = 0;

        for(int i=0;i<n;i++) {
            int temp = Integer.parseInt(v[i]);
            cnt += (temp+cluster-1)/cluster;
        }

        bw.write(cnt*cluster+"");

        br.close();
        bw.close();
    }
}