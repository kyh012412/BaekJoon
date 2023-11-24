
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int N,M;
	static boolean miro[][];
	static String map[];
	static int ir,ic;
	static int D[][] = { {1,0},{0,1},{-1,0},{0,-1}};
	static int count=0;
	
	public static int bfs(int ir,int ic) {
		Queue<point> q = new LinkedList<>();
		
		miro[ir][ic]=true; //방문함
		q.add(new point(ir,ic));
		while(!q.isEmpty()) {
			point cur = q.remove();
			if(map[cur.r].charAt(cur.c)=='P')
				count++;
			for(int i=0;i<4;i++) {
				int nr = cur.r + D[i][0];
				int nc = cur.c + D[i][1];
				
				if(nr<=0 || nr>N || nc<=0 || nc>M) {
					continue;
				}
				if(miro[nr][nc]) {
					continue;
				}
				miro[nr][nc]=true;
				q.add(new point(nr,nc));
			}
		}
		return count;
	}
	public static class point{
		int r;
		int c;
		public point(int r, int c) {
			this.r = r;
			this.c = c;
		}
		@Override
		public String toString() {
			return r+" "+c;
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String v[] = br.readLine().split(" ");
			N= Integer.parseInt(v[0]);
			M= Integer.parseInt(v[1]);
			miro = new boolean[N+1][M+1];
			map = new String[N+1];
			outer:for(int i=0;i<N+1;i++) {
				if(i==0) continue outer;
				String str = br.readLine();
				map[i] = "X"+str;
				for(int j=0;j<map[i].length();j++) {
					if(ir==0 && ic==0)
					if(map[i].charAt(j)=='I') {
						ir = i;
						ic = j;
					}
					if(map[i].charAt(j)=='X') {
						miro[i][j]=true; //true가 갈수없는데 = visited
					}
				}
			}
			int count=bfs(ir,ic);
			if(count ==0) {
				bw.write("TT");
			}else {
				bw.write(""+count);
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}