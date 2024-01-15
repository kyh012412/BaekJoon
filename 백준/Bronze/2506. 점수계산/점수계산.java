import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int idx=1;
        int ans=0;
        for(int i=0;i<n;i++) {
            if(st.nextToken().equals("1")) {
                ans += idx++;
            }else {
                idx=1;
            }
        }

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}