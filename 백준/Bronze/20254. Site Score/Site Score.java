import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String v[] = br.readLine().split(" ");

        int a[] = new int[v.length];

        for(int i=0;i<v.length;i++) {
            a[i] = Integer.parseInt(v[i]);
        }

        bw.write(56*a[0]+24*a[1]+14*a[2]+6*a[3]+"");

        br.close();
        bw.close();
    }
}