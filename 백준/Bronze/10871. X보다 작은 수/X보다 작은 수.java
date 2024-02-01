
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = 
				Integer.parseInt(st.nextToken());
		int x = 
				Integer.parseInt(st.nextToken());
		
		int ans[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		int idx= 0;
		
		for(int i=0;i<n;i++) {
			int num =Integer.parseInt(st.nextToken()); 
			if(x>num) {
				ans[idx++] = num;
			}
		}
		int len = idx;
		for(int i=0;i<len;i++) {
			bw.write(ans[i]+" ");
		}
		
		br.close();
		bw.close();
	}
}