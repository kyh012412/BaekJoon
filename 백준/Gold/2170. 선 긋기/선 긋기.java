
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	static int n;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]-o2[0]!=0) {
					return o1[0]-o2[0];
				}else {
					return o1[1]-o2[1];
				}
			}
		});
		
		String v[];
		for(int i=0;i<n;i++) {
			v = br.readLine().split(" ");
			int a = Integer.parseInt(v[0]);
			int b = Integer.parseInt(v[1]);
			pq.add(new int[] {a,b});
		}
		int totallen=0;
		
		int cur[] = {-1000000000,-1000000000};
		while(!pq.isEmpty()) {
			int polled[] = pq.poll();
			if(cur[1]<polled[0]) {
				totallen += cur[1]-cur[0];
				cur=polled;
				continue;
			}
			if(polled[1]<cur[1]) {
				continue;
			}
			cur[1]=polled[1];
			continue;
		}
		totallen += cur[1]-cur[0];
		
		bw.write(totallen+"");
		
		bw.close();
		br.close();
	}
}