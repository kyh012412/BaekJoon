import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static ArrayList<Integer> order[];
    public static int[] time; // 개인 건설시간
    public static int[] waittime; // 요구건물들의 건설시간 합
    public static int[] totaltime; // 대기시간 + 건설시간

    public static int[] end;
    public static int n,k;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = 1;

        end = new int[n+1];
        order = new ArrayList[n+1];
        for(int i=1;i<n+1;i++) {
            order[i] = new ArrayList<Integer>();
        }

        time = new int[n+1];
        waittime = new int[n+1];
        totaltime = new int[n+1];

        while(k<n+1) {
            st=new StringTokenizer(br.readLine());
            time[k] = Integer.parseInt(st.nextToken());
            while(st.hasMoreTokens()) {
                int decoded = Integer.parseInt(st.nextToken());
                if(decoded==-1) break;

                order[decoded].add(k);
                end[k]++;
            }
            k++;
        }

        Deque<Integer> dq = new LinkedList<Integer>();

        for(int i=1;i<n+1;i++) {
            if(end[i]==0) {
                dq.add(i);
            }
        }

        while(!dq.isEmpty()) {
            int num = dq.poll(); // 선행
            totaltime[num] = time[num] + waittime[num];
            for(int next:order[num]) { // 후행 (next)
                end[next]--;
                waittime[next] = Math.max(waittime[next], totaltime[num]);
                if(end[next]==0) {
                    dq.add(next);
                }
            }
        }

        for(int i=1;i<n+1;i++) {
            bw.write(totaltime[i]+"\n");
        }

        bw.close();
        br.close();
    }
}