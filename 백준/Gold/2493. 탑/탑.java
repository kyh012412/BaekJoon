
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int arr[];
	static int ans[];
	static int temp[];
	static double max=-1;


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		ans = new int[n+1];

		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0]=100000001;
		for(int i=1;i<n+1;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			s.add(arr[i]);
		}
		
		for(int i=n;i>=1;i--) {			
			int num = s.pop();
			s2.add(i);
			if(s.isEmpty()) {
				while(!s2.isEmpty()) {
					int idx= s2.pop();
					ans[idx]=0;
				}
			}else {
				int topnum=s.peek();
				while(!s2.isEmpty()) {
					int idx = s2.peek();
					if(arr[idx]<topnum) {
						ans[idx]=i-1;
						s2.pop();
					}else {
						break;
					}
				}
			}
		}
		
		for(int i=1;i<n+1;i++) {
			bw.write(ans[i]+" ");
		}
		
		bw.close();
		br.close();
	}
}