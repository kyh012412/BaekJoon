
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int arr[];
	static int max;
	static int sumto[];
	static int min;
	static int rmax;

	public static int max(int... a) {
		int max = a[0];
		for (int i : a) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		sumto = new int[n];
		int dp[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 0) {
				sumto[i] = arr[i];
				rmax = sumto[i];
				dp[i] = arr[i];
			} else {
				if(arr[i]>rmax) {
					rmax=arr[i];
				}
				
				sumto[i] = arr[i] + sumto[i - 1];
				dp[i] = dp[i-1]+arr[i];
				if(dp[i]<=0) {
					dp[i]=0;
				}else if(dp[i]>rmax) {
					rmax=dp[i];
				}
			}
		}

		bw.write(rmax + "");

		bw.flush();
		br.close();
	}
}