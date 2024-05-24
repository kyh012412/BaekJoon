import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            a[i]  = Integer.parseInt(st.nextToken());
        }

        int count=0;
        int max=0;
        for(int i=0;i<n-1;i++) {
            count=0;
            for(int j=i+1;j<n;j++) {
                if(a[i]>a[j]) {
                    count++;
                    if(count>max) {
                        max=count;
                    }
                }else {
                    break;
                }
            }
        }
        bw.write(max+"");

        br.close();
        bw.close();
    }
}