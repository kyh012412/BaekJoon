
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int a;
	static int b;
	static boolean visited[];
	static HashMap<Integer, Integer> map;
	
	public static int bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[a]=true;
		q.add(a);
		if(a==b) return 0;
		while(!q.isEmpty()) {
			int cur = q.poll();
			int t = map.get(cur);
//			if(cur == b) {
//				return t;
//			}
			int idx=1;
			while(true) {
				int ncur = cur*(int)Math.pow(2,idx);
				if(ncur>=visited.length || ncur<0 || visited[ncur]) {
					break;
				}
				if(ncur==b) return t;
				visited[ncur]=true;
				map.put(ncur, t);
				q.add(ncur);
				idx++;
			}
			int ncur = cur-1;
			if(ncur<visited.length && ncur>=0 && !visited[ncur]) {
				if(ncur==b) return t+1;
				visited[ncur]=true;
				map.put(ncur, t+1);
				q.add(ncur);
			}
			ncur = cur+1;
			if(ncur<visited.length && ncur>=0 && !visited[ncur]) {
				if(ncur==b) return t+1;
				visited[ncur]=true;
				map.put(ncur, t+1);
				q.add(ncur);
			}
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[] = br.readLine().split(" ");
		a = Integer.parseInt(v[0]);
		b = Integer.parseInt(v[1]);
		map = new HashMap<Integer, Integer>();
		visited = new boolean[100001];
		map.put(a, 0);
		
		bw.write(""+bfs());
	
		br.close();
		bw.close();
	}
}