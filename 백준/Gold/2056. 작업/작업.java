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

    public static int[] end;
    public static int n,k;

    public static int[] time; // 순수 작업 시간
    public static int[] wtime; // 기다리는 시간
    public static int[] ttime; // 기다리는 시간 + 순수 작업 시간

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = 1;

        end = new int[n+1];
        order = new ArrayList[n+1];

        time = new int[n+1];
        wtime = new int[n+1];
        ttime = new int[n+1];

        for(int i=1;i<n+1;i++) {
            order[i] = new ArrayList<Integer>();
        }

        while(k<n+1) {
            st=new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) { // k번째 에 대하여
                time[k] = Integer.parseInt(st.nextToken());
                int fn = Integer.parseInt(st.nextToken());
                for(int fni=0;fni<fn;fni++) {
                    int first = Integer.parseInt(st.nextToken());
                    wtime[k] = Math.max(wtime[k], ttime[first]);
                }
            }
            ttime[k] = time[k]+wtime[k];

            k++;
        }

        int max = Integer.MIN_VALUE;
        for(int i=1;i<n+1;i++) {
            max = Math.max(ttime[i], max);
        }

        bw.write(max+"");

        bw.close();
        br.close();
    }
}