
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;
	static int arr[];
	
	public static int max(int...a) {
		int max=a[0];
		for(int i:a) {
			if(max<i) {
				max=i;
			}
		}
				
		return max;
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		arr = new int[n+1];
		int dp[] = new int[n+1];
		
		for(int i=1;i<n+1;i++) {
			arr[i] =Integer.parseInt(br.readLine());
		}
		for(int i=1;i<n+1;i++) {
			if(i==1)
			dp[i]=arr[i];
			else if(i==2) {
				dp[i] = dp[i-1]+arr[i];
			}else {
				dp[i] = max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
			}
		}
		bw.write(dp[n]+"");

		bw.close();
		br.close();
	}
}