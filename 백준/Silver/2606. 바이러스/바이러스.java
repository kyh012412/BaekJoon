
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;
	static boolean connected[][];
	static boolean visited[];
	static int count=0;

	public static int getconnetedcount(int a) {
		count=0;		
		visited = new boolean[n+1];
		visited[a]=true;
		bfs(a);		
		return count;
	}
	
	public static void bfs(int a) {
		for(int i=1;i<=n;i++) {
			if(i==a) {
				continue;
			}
			if(connected[a][i]&&!visited[i]) {
				visited[i]=true;
				count++;
				bfs(i);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		connected = new boolean[n+1][n+1];
		int m = Integer.parseInt(br.readLine());
		String v[];
		for(int i=0;i<m;i++) {
			v = br.readLine().split(" ");
			int a = Integer.parseInt(v[0]);
			int b = Integer.parseInt(v[1]);
			connected[a][b] =true;
			connected[b][a] =true;
		}
		
		bw.write(getconnetedcount(1)+"");
		

		bw.close();
		br.close();
	}
}