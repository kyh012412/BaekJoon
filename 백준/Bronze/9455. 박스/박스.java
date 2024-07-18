import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int boxCounter[] = new int[c];
			int ans=0;
			
			for(int i=0;i<r;i++) {
				String v[] = br.readLine().split(" ");
				for(int j=0;j<c;j++) {
					switch(v[j]) {
					case "0":
						ans += boxCounter[j];
						continue;
					case "1":
						boxCounter[j]++;
						continue;
					}
				}
			}
			bw.write(ans+"\n");
		}

		br.close();
		bw.close();
	}
}
