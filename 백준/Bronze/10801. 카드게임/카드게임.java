import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a[] = new int[10];
        int b[] = new int[10];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<10;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<10;i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int val = 0;
        //a가 이기면 ++ b가 이기면 --;
        for(int i=0;i<10;i++) {
            if(a[i]>b[i]) {
                val++;
            }else if(a[i]<b[i]) {
                val--;
            }
        }
        if(val>0) {
            bw.write("A");
        }else if(val<0) {
            bw.write("B");
        }else {
            bw.write("D");
        }

        br.close();
        bw.close();
    }
}