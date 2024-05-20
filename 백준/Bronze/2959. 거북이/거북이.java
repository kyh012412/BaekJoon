import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a[] = new int[4];

        for(int i=0;i<4;i++) {
            a[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(a);

        bw.write(a[0]*a[2]+"");

        br.close();
        bw.close();
    }
}