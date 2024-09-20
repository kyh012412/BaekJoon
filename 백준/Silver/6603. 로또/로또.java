import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int[] s;
    public static ArrayList<Integer> p= new ArrayList<>();

    public static void napsack(int start) {
        //넣어
        //검사
            //넣거나 빼
            //출력
        if(p.size()==6) {
            print();
            return;
        }
        for(int i=start;i<s.length;i++) {
            if(!p.contains(s[i])) {
                p.add(s[i]);
                napsack(i+1);
                p.remove(p.size()-1);
            }
        }
    }

    public static void print() {
        for(int i=0;i<6;i++) {
            ans.append(p.get(i)+" ");
        }
        ans.append("\n");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n==0) break;

            s = new int[n];
            for(int i=0;i<n;i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }

            napsack(0);
            ans.append("\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}