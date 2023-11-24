
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static int n;
	static int arr[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr = new int[n+1];
		int lo[] = new int[n+1];
		String v[];
		int brr[];
		v= br.readLine().split(" ");
		for(int i=1;i<n+1;i++) {
			arr[i] = Integer.parseInt(v[i-1]);
			lo[arr[i]]=i;	//num값은 lo[num] = num의 idx;		
		}
		int tc = Integer.parseInt(br.readLine());
		for(int i=0;i<tc;i++) {
			v=br.readLine().split(" ");
			int s=Integer.parseInt(v[0]);
			int e=Integer.parseInt(v[1]);
			brr=new int[e-s+1]; //필요한만큼만 자리만들어서
			int val[] =new int[e-s+1];
			int idx=0;
			for(int j=s;j<e+1;j++) {
				val[idx]=j; //val에는 값들이 들어감
				brr[idx++] = lo[j];//brr에는 이제 로케이션들이 들어가고
			}
			Arrays.sort(brr);
			idx=1;
			int arc[] = arr.clone();
			for(int j=0;j<brr.length;j++) {
				arc[brr[j]]=val[j];
			}
			for(int j=1;j<arc.length;j++) {
				sb.append(arc[j]+" ");
			}
			bw.write(sb.toString());
			bw.newLine();
			sb.setLength(0);
		}
		
		bw.close();
		br.close();
	}
}