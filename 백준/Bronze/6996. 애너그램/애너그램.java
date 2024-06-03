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

        int n = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> map  =new HashMap<Character, Integer>();

        outer:for(int i=0;i<n;i++) {
            map.clear();
            StringTokenizer st = new StringTokenizer(br.readLine());

            String a = st.nextToken();
            String b = st.nextToken();
            for(int j=0;j<a.length();j++) {
                char ch = a.charAt(j);
                map.put(ch,map.getOrDefault(ch, 0)+1);
            }
            for(int j=0;j<b.length();j++) {
                char ch = b.charAt(j);
                if(!map.containsKey(ch)) {
                    bw.write(a+" & "+b+" are NOT anagrams.\n");
                    continue outer;
                }
                if(map.get(ch)==1) {
                    map.remove(ch);
                    continue;
                }
                map.put(ch,map.get(ch)-1);
            }
            if(map.size()==0) {
                bw.write(a+" & "+b+" are anagrams.\n");
                continue;
            }else {
                bw.write(a+" & "+b+" are NOT anagrams.\n");
                continue outer;
            }
        }

        br.close();
        bw.close();
    }
}