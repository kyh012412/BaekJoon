
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int n, k; // n 갯수 //t 타겟숫자
//	static int arr[];
	static boolean connected[];
	static ArrayList<node> elist[];
	
	static class node implements Comparable<node>{
		int next,cost;

		public node(int next, int cost) {
			this.next = next;
			this.cost = cost;
		}

		@Override
		public int compareTo(node o) {
			return cost-o.cost;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return next+" "+cost;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

//		arr = new int[n + 1];
		connected = new boolean[n+1];
		elist = new ArrayList[n+1];
		for(int i=1;i<n+1;i++) {
			elist[i] = new ArrayList<Main.node>();
		}


		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			elist[a].add(new node(b,c));
			elist[b].add(new node(a,c));
		}
		int totalcost =0;
		
		PriorityQueue<node> pq = new PriorityQueue<Main.node>();
		ArrayList<Integer> costlist = new ArrayList<Integer>();
		
		pq.add(new node(1,0));
		
		while(!pq.isEmpty()){
			node cur = pq.poll();
			int here = cur.next;
			int cost = cur.cost;
			
			if(connected[here]) continue;
			connected[here]=true;
			totalcost+=cost;
			costlist.add(cost);
			
			for(node next : elist[here]) {
				if(connected[next.next])continue;
				pq.add(next);
			}
		}
		
		Collections.sort(costlist,Collections.reverseOrder());
		totalcost -= costlist.get(0);
		bw.write(totalcost+"");
		
		bw.flush();
		br.close();
	}
}