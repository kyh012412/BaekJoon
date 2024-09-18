import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

	public static StringBuilder sb = new StringBuilder();
	public static StringTokenizer st;
	public static final int INF = Integer.MAX_VALUE;
	public static int maxTime = INF;
			

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a,b;
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a<=b) {
				maxTime = Math.min(maxTime,b);
			}
		}
		
		bw.write(maxTime==INF?-1+"":maxTime+"");
		
		bw.close();
		br.close();
	}
}