import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static boolean[] visited;
    public static int[] depth;
    public static ArrayList<Integer>[] list;

    public static void dfs(int s,int curd) {
//      if(visited[s]) return;
        visited[s] = true;
        depth[s]=curd;
        for(int next : list[s]) {
            if(!visited[next]) {
                dfs(next,curd+1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken()); // 시작 정점

        visited = new boolean[n+1];
        list = new ArrayList[n+1];
        depth = new int[n+1];
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

        Arrays.fill(depth, -1);
        for(int i=1;i<n+1;i++) {
            Collections.sort(list[i]);
        }

        dfs(r,0);

        for(int i=1;i<n+1;i++) {
            ans.append(depth[i]+"\n");
        }

        bw.write(ans.toString());

        bw.close();
        br.close();
    }
}