import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static StringTokenizer st;
    public static StringBuffer ans = new StringBuffer();

    public static int[] dx = {1,1,0,-1,-1,-1,0,1};
    public static int[] dy = {0,1,1,1,0,-1,-1,-1};

    public static int bfs(boolean[][] visited,int h,int w) {
        int count=0;

        Queue<int[]> q = new LinkedList<int[]>();
        for(int i=0;i<h;i++) {
            for(int j=0;j<w;j++) {
                if(!visited[i][j]) {
                    count++;
                    visited[i][j]=true;
                    q.add(new int[] {i,j});
                    while(!q.isEmpty()) {
                        int polled[] = q.poll();
                        for(int k=0;k<8;k++) {
                            int nr = polled[0]+dy[k];
                            int nc = polled[1]+dx[k];

                            if(nr<0 || nc<0 || nr>=h || nc>=w) continue;
                            if(visited[nr][nc]) continue;

                            visited[nr][nc]=true;
                            q.add(new int[] {nr,nc});
                        }
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     

        while(true) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if(w==0 && h==0) break;

            boolean visited[][] = new boolean[h][w];

            for(int i=0;i<h;i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<w;j++) {
                    int num = Integer.parseInt(st.nextToken());
                    switch(num) {
                    case 1:
                        visited[i][j]=false;
                        break;
                    case 0:
                        visited[i][j]=true;
                        break;
                    }
                }
            }

            int count = bfs(visited,h,w);
            ans.append(count+"\n");
        }

        bw.write(ans.toString());

        br.close();
        bw.close();
    }
}
