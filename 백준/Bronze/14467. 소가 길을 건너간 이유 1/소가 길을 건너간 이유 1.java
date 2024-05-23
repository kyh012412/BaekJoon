import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());        
        int count=0;

        for(int i=0;i<n;i++) {
            String v[] = br.readLine().split(" ");
            if(!map.containsKey(v[0])) {
                map.put(v[0], v[1]);
                continue;
            }

            if(!map.get(v[0]).equals(v[1])) {
                count++;
                map.put(v[0], v[1]);
            }
        }

        bw.write(count+"");

        br.close();
        bw.close();
    }
}