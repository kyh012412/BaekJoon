
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<Integer>();

		String v[];
		v = br.readLine().split(" ");
		int a = Integer.parseInt(v[0]);
		for(int i=0;i<a;i++) {
			q.add(i+1);
		}
		
		while(!q.isEmpty()) {
			bw.write(""+q.poll()+" ");
			if(q.isEmpty()) {
				break;
			}
			q.add(q.poll());
		}
		bw.close();
		br.close();
	}
}