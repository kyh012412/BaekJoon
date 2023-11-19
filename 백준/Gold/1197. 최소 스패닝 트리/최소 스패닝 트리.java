
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {

	static int n,k;
	static boolean conneted[];
	
	static class node implements Comparable<node>{
		int b,c;

		public node(int b, int c) {
			this.b = b;
			this.c = c;
		}
		
		@Override
		public String toString() {
			return b+" "+c;
		}

		@Override
		public int compareTo(node o) {
			return c-o.c;
		}
	}
	
	static ArrayList<node> elist[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		k = Integer.parseInt(v[1]);
		
		conneted = new boolean[n+1];
		elist = new ArrayList[n+1];
		
		for(int i=1;i<n+1;i++) {
			elist[i]=new ArrayList<Main.node>();
		}
		
		for(int i=0;i<k;i++) {
			v=br.readLine().split(" ");
			int a=Integer.parseInt(v[0]);
			int b=Integer.parseInt(v[1]);
			int c=Integer.parseInt(v[2]);
			elist[a].add(new node(b,c));
			elist[b].add(new node(a,c));
		}
		
		PriorityQueue<node> pq = new PriorityQueue<Main.node>();
		
		pq.add(new node(1,0));
		int totalcost = 0;
		while(!pq.isEmpty()) {
			node cur = pq.poll();
			int next=cur.b;
			int cost=cur.c;
			if(conneted[next])continue;
			
			conneted[next]=true;
			totalcost+=cost;
			for(node nn :elist[next]) {
				if(conneted[nn.b]) continue;
				pq.add(nn);
			}
			
		}
		
		bw.write(""+totalcost);

		bw.close();
		br.close();
	}
}