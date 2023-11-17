import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int c,r;
	static int map[][];
	static boolean visited[][];
	static Queue<int[]> q = new LinkedList<int[]>();
	static int max=0;
	static int unvisitedsitecount=0;
	
	public static void bfs() {
		int d[][] = {{1,0},{0,1},{-1,0},{0,-1}};
		while(!q.isEmpty()) {
			int cur[] = q.poll();
			
			for(int i=0;i<4;i++) {
				int nr = cur[0]+d[i][0];
				int nc = cur[1]+d[i][1];
				
				if(nr<0||nc<0||nr>=r||nc>=c) {
					continue;
				}
				if(visited[nr][nc] || map[nr][nc]==-1) {
					continue;
				}
				unvisitedsitecount--;
				visited[nr][nc]=true;
				map[nr][nc]= map[cur[0]][cur[1]]+1;		
				q.add(new int[] {nr,nc});
				if(map[nr][nc]>max) {
					max=map[nr][nc];
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		r = Integer.parseInt(v[1]);
		c = Integer.parseInt(v[0]);
		
		map = new int[r][c];
		visited = new boolean[r][c];
		
		for(int i=0;i<r;i++) {
			v= br.readLine().split(" ");
			for(int j=0;j<c;j++) {
				map[i][j]=Integer.parseInt(v[j]);
				if(map[i][j]==1) {
					max=1;
					visited[i][j]=true;
					q.add(new int[] {i,j});
				}else if(map[i][j]==0) {
					unvisitedsitecount++;
				}
				
			}
		}
		
		bfs();
		
		if(unvisitedsitecount!=0) {
			bw.write("-1");
		}else {
			bw.write(max-1+"");
		}
		
		bw.flush();
		br.close();
	}
}