import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());		
		
		int arr[] = new int[n+1];
		
		String v[] = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			arr[i+1]=arr[i]+Integer.parseInt(v[i]);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0;i<m;i++) {
			String str= br.readLine();
			v = str.split(" ");
			int a = Integer.parseInt(v[0])-1;
			int b = Integer.parseInt(v[1]);
			
			bw.write(arr[b]-arr[a]+"\n");
		}
		
		br.close();
		bw.close();
	}
}