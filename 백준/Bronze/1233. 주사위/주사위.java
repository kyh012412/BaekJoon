import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 1; i < a + 1; i++) {
            sum += i;
            for (int j = 1; j < b + 1; j++) {
                sum += j;
                for (int k = 1; k < c + 1; k++) {
                    sum += k;
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                    sum -= k;
                }
                sum -= j;
            }
            sum -= i;
        }

        int maxApperValKey = -1;
        int apperedval = 0;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == apperedval && entry.getKey() < maxApperValKey) {
                maxApperValKey = entry.getKey();
                continue;
            } else if (entry.getValue() > apperedval) {
                maxApperValKey = entry.getKey();
                apperedval = entry.getValue();
                continue;
            }
        }

        bw.write(maxApperValKey + "");

        br.close();
        bw.close();
    }
}