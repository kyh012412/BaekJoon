import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int defaultVal =0;
        for(int i=0;i<26;i++) {
            defaultVal += (int)(i+'A');
        }

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {

            int ans = defaultVal;
            String str = br.readLine();
            boolean atoz[] = new boolean[26]; 

            for(int j=0;j<str.length();j++) {
                char ch = str.charAt(j);
                if(!atoz[ch-'A']) {
                    atoz[ch-'A'] = true;
                    ans -= (int)ch;
                }
            }
            bw.write(ans+"\n");
        }

        br.close();
        bw.close();
    }
}