import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static int n=-1,m=-1;

    public static boolean check(int a,int b) {
        return (a*a+b*b+m) % (a*b)==0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(tc-->0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int ans=0;
            for(int b=n-1;b>0;b--) {
                for(int a=b-1;a>0;a--) {
                    if(check(a,b)) ans++;
                }
            }
            bw.write(ans+"\n");
        }

        br.close();
        bw.close();
    }
}