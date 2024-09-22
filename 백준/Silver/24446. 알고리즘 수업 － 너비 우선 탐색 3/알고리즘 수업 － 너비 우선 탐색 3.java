import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static boolean[] visited;
    public static ArrayList<Integer>[] list;
    public static int[] depths;

    public static void bfs(int s,int depth) {
        visited[s] = true;
        depths[s] = depth;

        Deque<Integer> q = new LinkedList<Integer>();
        q.addLast(s);
        while(!q.isEmpty()) {
            int f = q.pollFirst();
            int curd = depths[f];
            for(int n:list[f]) {
                if(!visited[n]) {
                    visited[n]=true;
                    depths[n] = curd+1;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        depths = new int[n+1];
        list = new ArrayList[n+1];
        for(int i=1;i<n+1;i++) {
            list[i] = new ArrayList<Integer>();
        }

        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        Arrays.fill(depths,-1);
        bfs(r,0);

        for(int i=1;i<n+1;i++) {
            ans.append(depths[i]+"\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}