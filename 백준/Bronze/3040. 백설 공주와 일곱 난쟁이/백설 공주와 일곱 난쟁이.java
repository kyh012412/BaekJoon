import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a[] = new int[9];
        int total=0;

        for(int i=0;i<9;i++) {
            a[i] = Integer.parseInt(br.readLine());
            total += a[i];
        }

        int idx[] = new int[2];
        outer:for(int i=0;i<8;i++) {
            total -= a[i];
            for(int j=i+1;j<9;j++) {
                total -= a[j];
                if(total == 100) {
                    idx[0] =i;
                    idx[1] = j;
                    break outer;
                }
                total +=a[j];
            }
            total += a[i];
        }

        for(int i=0;i<9;i++) {
            if(i!=idx[0] && i!=idx[1]) {
                bw.write(a[i]+"");
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }
}