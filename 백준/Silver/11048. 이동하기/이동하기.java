import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[1+n][1+m];
		
		for(int i=0;i<n+1;i++) {
			if(i==0) continue;
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m+1;j++) {
				if(j==0) continue;
				map[i][j] = Integer.parseInt(st.nextToken())+Math.max(map[i-1][j], map[i][j-1]);
			}
		}
		
		bw.write(map[n][m]+"");
		
		br.close();
		bw.close();
	}
}