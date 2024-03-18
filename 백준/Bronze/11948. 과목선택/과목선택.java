import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a[] = new int[4];
        int []b = new int[2];

        for(int i=0;i<4;i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<2;i++) {
            b[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;

        for(int i: a) {
            sum += i;
        }

        sum -= a[0];

        sum += b[1];

        bw.write(sum+"");

        br.close();
        bw.close();
    }
}