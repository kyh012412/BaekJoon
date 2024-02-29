import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }
        int ans=0;
        str = br.readLine();
        for(int i=0;i<str.length();i++) {
            char temp = str.charAt(i);

            if(map.containsKey(temp)) {
                if(map.get(temp)!=1) {
                    map.put(temp, map.get(temp)-1);
                }else {
                    map.remove(temp);
                }
            }else {
                ans++;
            }
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()) {
            ans+= entry.getValue();
        }
        bw.write(ans+"");

        br.close();
        bw.close();
    }

}