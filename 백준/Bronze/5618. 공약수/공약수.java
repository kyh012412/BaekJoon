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

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int divisor = a[0];
        outer:while(true) {
            for(int i=0;i<n;i++) {
                if(a[i]%divisor!=0) {
                    divisor--;
                    continue outer;
                }
            }
            break;
        }

        for(int i=1;i<divisor+1;i++) {
            if(divisor%i==0) {
                bw.write(i+"\n");
            }
        }

        br.close();
        bw.close();
    }
}