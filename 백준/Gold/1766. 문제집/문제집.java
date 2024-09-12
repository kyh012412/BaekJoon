import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static ArrayList<Integer> order[];

    public static int[] end;
    public static int[] fixend;
    public static int n,k;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        order = new ArrayList[n+1];
        end = new int[n+1];
        fixend = new int[n+1];

        for(int i=1;i<n+1;i++) {
            order[i] = new ArrayList<Integer>();
        }

        while(k-->0) {
            st= new StringTokenizer(br.readLine());
            int a,b;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            order[a].add(b);
            end[b]++;
            fixend[b]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> {
            if(end[o1]!=end[o2]) {
                return end[o1]-end[o2];
            }
            return o1-o2;
        });

        for(int i=1;i<n+1;i++) {
            if(end[i]==0) {
                pq.add(i);
            }
        }

        while(!pq.isEmpty()) {
            int num = pq.poll(); // 앞
            for(int i:order[num]) { // 뒤
                end[i]--;
                if(end[i]==0)
                    pq.add(i);
            }
            bw.write(num+" ");
        }

        bw.close();
        br.close();
    }
}