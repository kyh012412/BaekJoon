import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String v[] = br.readLine().split(" ");
			int N = Integer.parseInt(v[0]);
			int K = Integer.parseInt(v[1]);
			int a[] = new int[N];
			int fixedN= N;
			int idx=0;
			boolean needbreak =false;
			Queue<Integer> q = new LinkedList<>();
			for(int i=1;i<N+1;i++) {
				q.add(i);
			}			
			while(!needbreak) {
				for(int i=0;i<K-1;i++) {
					q.add(q.poll());
				}
				a[idx++] = q.poll();
				if(q.isEmpty()) {
					needbreak=true;
				}
			}
			String towrite="<";
			for(int i=0;i<a.length;i++) {
				if(i!=a.length-1) {
					towrite +=a[i] +", ";
				}else {
					towrite +=a[i]+">";
				}
			}
		
			bw.write(towrite);
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}