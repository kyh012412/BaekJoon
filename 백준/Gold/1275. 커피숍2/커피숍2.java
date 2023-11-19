
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int a[];
	
	static long func(String str) {
		String vv[] = str.split(" ");
		int s = Integer.parseInt(vv[0]);
		int ss= s;
		int e = Integer.parseInt(vv[1]);
		s = ss<e?ss:e;
		e = ss>e?ss:e;
		
		int idx = Integer.parseInt(vv[2]);
		int nval = Integer.parseInt(vv[3]);
		long sum =0;
		for(int i=s;i<=e;i++) {
			sum+=a[i];
		}
		a[idx]=nval;
		
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v[];
		v= br.readLine().split(" ");
		int N = Integer.parseInt(v[0]);
		int Q = Integer.parseInt(v[1]);
		
		v = br.readLine().split(" ");
		a = new int[N+1];
		for(int i=1;i<N+1;i++) {
			a[i] = Integer.parseInt(v[i-1]);
		}
		for(int i=0;i<Q;i++) {
			bw.write(""+func(br.readLine()));
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}
}