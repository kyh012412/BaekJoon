import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main { 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> keys = new ArrayList<Integer>();

        int index=0; //교수님의 지각시간
        while(true) {
            int benefit = index + index*index;
            if(benefit>10000) {
                break;
            }

            map.put(index,benefit);
            keys.add(index);
            index++;
        }

        int tc = Integer.parseInt(br.readLine());

        outer:for(int i=0;i<tc;i++) {
            int max = Integer.parseInt(br.readLine());
            int keyindex = 0;
            int ans = 0;
            while(true) {
                if(map.getOrDefault(keyindex, 10001)<=max) {
                    ans = keyindex;
                    keyindex++;
                    continue;
                }
                bw.write(ans+"\n");
                continue outer;
            }
        }

        br.close();
        bw.close();
    }
}