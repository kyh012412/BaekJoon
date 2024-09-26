import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            map.clear();
            map2.clear();
            st = new StringTokenizer(br.readLine());

            int index=0;
            while(st.hasMoreTokens()) {
                String key = st.nextToken();
                int value = index++;
                map.put(key,value);
            }

            st = new StringTokenizer(br.readLine());

            ArrayList<Integer> list = new ArrayList<Integer>();
            while(st.hasMoreTokens()) {
                String key = st.nextToken();
                list.add(map.get(key));
            }

            index=0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                map2.put(list.get(index++),st.nextToken());
            }

            for(int i=0;i<list.size();i++) {
                ans.append(map2.get(i)+" ");
            }
            ans.append("\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}