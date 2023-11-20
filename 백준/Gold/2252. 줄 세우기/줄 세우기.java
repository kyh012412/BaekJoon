
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n,k;
	static int endcount[];
	static ArrayList<Integer> elist[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		endcount = new int[n+1];
		elist = new ArrayList[n+1];
		
		for(int i=1;i<n+1;i++) {
			elist[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<k;i++) {
			st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			elist[a].add(b);
			endcount[b]++;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1;i<n+1;i++) {
			if(endcount[i]==0) {
				q.add(i);
			}
		}
		
		StringBuilder ans = new StringBuilder();
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			ans.append(cur+" ");
			for(int next : elist[cur]) {
				endcount[next]--;
				if(endcount[next]==0) {
					q.add(next);
				}
			}
		}
		
		bw.write(ans.toString());

		bw.flush();
		br.close();
	}
}