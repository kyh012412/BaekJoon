import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		
		int arr[][]=new int[row+1][col+1];
		
		for(int j=0;j<row+1;j++) {
			if(j==0) {
				arr[j][0]=0;
				continue;
			}
			st= new StringTokenizer(br.readLine());
			for(int i=0;i<col+1;i++) {
				if(j==0 || i==0) {
					arr[j][i]=0;
					continue;
				}
				arr[j][i]=Integer.parseInt(st.nextToken())+arr[j][i-1];
			}
		}
		
		for(int j=0;j<row+1;j++) {
			for(int i=0;i<col+1;i++) {
				if(j==0 || i==0) {
					continue;
				}
				arr[j][i]+=arr[j-1][i];
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken())-1;
			int b= Integer.parseInt(st.nextToken())-1;
			int c= Integer.parseInt(st.nextToken());
			int d= Integer.parseInt(st.nextToken());
			int ans = arr[c][d]-arr[a][d]-arr[c][b]+arr[a][b];
			bw.write(ans+"\n");
		}

		br.close();
		bw.close();
	}
}
