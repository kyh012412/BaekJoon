
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;
	static int m;
	static int arr[];
	static int sum[];
	
	public static int max(int...a) {
		int max = a[0];
		for(int i: a) {
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
		m = Integer.parseInt(v[1]);
		arr = new int[n+1];
		sum = new int[n+1];
		
		v = br.readLine().split(" ");
		for(int i=1;i<n+1;i++) {
			arr[i] =Integer.parseInt(v[i-1]);
			sum[i] = sum[i-1]+arr[i];
		}
		
		for(int i=0;i<m;i++) {
			v=br.readLine().split(" ");
			int a = Integer.parseInt(v[0]);
			int b = Integer.parseInt(v[1]);
			bw.write(sum[b]-sum[a-1]+"");
			bw.newLine();
		}

		bw.close();
		br.close();
	}
}