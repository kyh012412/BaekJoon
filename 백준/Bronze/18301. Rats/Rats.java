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

        int value = (a[0]+1)*(a[1]+1)/(a[2]+1)-1;

        bw.write(value+"");

        br.close();
        bw.close();
    }
}