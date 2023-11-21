
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	static int n;
	static int arr[];
	static ArrayList<Integer> list;
	static long sum=0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);
		arr = new int[n+1];
		
		if(n<3) {
			bw.write(n+"");
			bw.close();
			return;
		}
		arr[1]=1;
		arr[2]=2;
		for(int i=3;i<n+1;i++) {
			arr[i] = (arr[i-1]+arr[i-2])%10007;
		}
		
		bw.write(arr[n]+"");

		bw.close();
		br.close();
	}
}