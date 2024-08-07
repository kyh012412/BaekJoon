import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int ans=0;
        for(int i=0;i<n;i++) {
            if(str.equals(br.readLine())) {
                ans++;
            }
        }

        bw.write(ans+"");

        br.close();
        bw.close();
    }
}