import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main { 

    public static HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();

    public static int getValue(int key) {
        if(map.containsKey(key))
            return map.get(key);
        map.put(key, getValue(key-1)+key);
        return map.get(key);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map.put(1, 1);

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            bw.write(getValue(n)+"\n");
        }       

        br.close();
        bw.close();
    }
}