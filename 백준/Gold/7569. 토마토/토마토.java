
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int c, r, h;
	static int map[][][];
	static boolean visited[][][];
	static Queue<int[]> q = new LinkedList<int[]>();
	static int max = 0;
	static int unvisitedsitecount = 0;

	public static void bfs() {
		int dr[]= {1,-1,0,0,0,0};
		int dc[]= {0,0,1,-1,0,0};
		int dh[]= {0,0,0,0,1,-1};
		
			
		while (!q.isEmpty()) {
			int cur[] = q.poll();

			for (int i = 0; i < 6; i++) {
				int nr = cur[0] + dr[i];
				int nc = cur[1] + dc[i];
				int nh = cur[2] + dh[i];

				if (nr < 0 || nc < 0 || nh<0
						|| nr >= r || nc >= c || nh>=h
						) {
					continue;
				}
				if (visited[nr][nc][nh] || map[nr][nc][nh] == -1) {
					continue;
				}
				unvisitedsitecount--;
				visited[nr][nc][nh] = true;
				map[nr][nc][nh] = map[cur[0]][cur[1]][cur[2]] + 1;
				q.add(new int[] { nr, nc ,nh});
				if (map[nr][nc][nh] > max) {
					max = map[nr][nc][nh];
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
		h = Integer.parseInt(v[2]);

		map = new int[r][c][h];
		visited = new boolean[r][c][h];

		for (int k = 0; k < h; k++) {
			for (int i = 0; i < r; i++) {
				v = br.readLine().split(" ");
				for (int j = 0; j < c; j++) {
					map[i][j][k] = Integer.parseInt(v[j]);
					if (map[i][j][k] == 1) {
						max = 1;
						visited[i][j][k] = true;
						q.add(new int[] { i, j, k });
					} else if (map[i][j][k] == 0) {
						unvisitedsitecount++;
					}
				}
			}
		}
		bfs();

		if (unvisitedsitecount != 0) {
			bw.write("-1");
		} else {
			bw.write(max - 1 + "");
		}

		bw.flush();
		br.close();
	}
}