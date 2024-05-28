import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int a[] = new int[n+1];

        int idx=1;
        int shotcount=0;
        while(true) {
            a[idx]++;           
            if(a[idx]==m) {
                break;
            }
            if(a[idx]%2==1) {
                idx+=l;
                idx = idx>n?idx-n:idx;
            }else {
                idx-=l;
                idx = idx<1?idx+n:idx;
            }
            shotcount++;            
        }
        bw.write(shotcount+"");

        br.close();
        bw.close();
    }
}