import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    public static void setmap(String str) {
        int len = str.length();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            int up = len-i-1;
            int pow = (int)Math.pow(10, up);
            map.put(c, map.getOrDefault(c, 0)+pow);
        }
    }

    static class myset implements Comparable<myset>{
        char c;
        int v;

        public myset(char c, int v) {
            this.c = c;
            this.v = v;
        }
        @Override
        public int compareTo(myset o) {
            return o.v-v;           
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            setmap(br.readLine());
        }
        myset set[]= new myset[map.size()];     
        //테스트
        int idx=0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            set[idx++] = new myset(entry.getKey(),entry.getValue());
        }

        Arrays.sort(set);
        idx=9;
        long sum=0;
        for(int i=0;i<set.length;i++) {
            sum+=set[i].v*idx--;
        }

        bw.write(sum+"");

        br.close();
        bw.close();
    }
}