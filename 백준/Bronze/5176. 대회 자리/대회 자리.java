import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<tc;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int ans =0;
            set.clear();

            for(int j=0;j<a;j++) {
                int num = Integer.parseInt(br.readLine());
                if(set.contains(num)) {
                    ans++;
                }else {
                    set.add(num);
                }
            }

            bw.write(ans+"\n");
        }

        br.close();
        bw.close();
    }
}