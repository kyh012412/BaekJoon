import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int membercount = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0;i<membercount;i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0)+1);       
        }

        int ans = 0;

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            ans += (v+n-1)/n;
        }

        bw.write(ans+"");       

        br.close();
        bw.close();
    }
}