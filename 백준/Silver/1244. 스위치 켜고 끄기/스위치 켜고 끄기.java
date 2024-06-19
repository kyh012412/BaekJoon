import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main { 
    public static int n;
    public static int sw[]; //처음 1 마지막 n+1;

    public static void turnSide(int idx,int range) { //range양수
        if(range==0) toggle(idx);
        if(idx-range<=0) return;
        if(idx+range>n) return;
        if(sw[idx+range]!=sw[idx-range]) return;
        toggle(idx+range);
        toggle(idx-range);

        turnSide(idx,range+1);
    }

    public static void toggle(int idx) {
        sw[idx] = (sw[idx]+1)%2;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        sw = new int[n+1];

        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            sw[i+1]= Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());

            if(Integer.parseInt(st.nextToken())==1) {
                int num = Integer.parseInt(st.nextToken());
                int idx=0;
                for(int j=1;j<=n/num;j++) {
                    idx += num;
                    toggle(idx);
                }
            }else {
                int num = Integer.parseInt(st.nextToken());
                turnSide(num, 0);
            }
        }

        int cnt=0;
        for(int i=1;i<n+1;i++) {
            bw.write(sw[i]+" ");
            cnt++;
            if(cnt>=20) {
                bw.write("\n");
                cnt=0;
            }
        }

        br.close();
        bw.close();
    }
}