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

        int tc = Integer.parseInt(br.readLine());

        for(int tci=0;tci<tc;tci++) {
            int a[] = new int[5];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<5;i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            if(a[3]-a[1]>=4) {
                bw.write("KIN\n");
            }else {
                bw.write(a[1]+a[2]+a[3]+"\n");
            }
        }

        br.close();
        bw.close();
    }
}