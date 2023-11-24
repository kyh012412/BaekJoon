import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int N,M,s;//s는 시작번호
	static boolean graph[][];
	static boolean visited[]; 
	static String towrite ="";
	
	public static void dfs(int cur) {
		visited[cur]=true;
		towrite += cur+" ";
		for(int i=0;i<N+1;i++) {
			if(!visited[i] && graph[cur][i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int cur) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[cur]=true;
		q.add(cur);
		
		while(!q.isEmpty()) {
			int num = q.remove();
			towrite += num + " ";
			
			for(int i=0;i<N+1;i++) {
				if(!visited[i] && graph[num][i]) {
					visited[i]=true;
					q.add(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String v[] = br.readLine().split(" ");
			N=Integer.parseInt(v[0]);
			M=Integer.parseInt(v[1]);
			s=Integer.parseInt(v[2]);
			
			graph = new boolean[N+1][N+1];
			visited = new boolean[N+1];
			
			for(int i=0;i<M;i++) {
				v = br.readLine().split(" ");
				int a=Integer.parseInt(v[0]);
				int b=Integer.parseInt(v[1]);
				graph[a][b]=true;
				graph[b][a]=true;
			}
			
			dfs(s);
			bw.write(towrite);
			bw.newLine();
			
			towrite="";
			visited = new boolean[N+1];
			
			bfs(s);
			bw.write(towrite);
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}