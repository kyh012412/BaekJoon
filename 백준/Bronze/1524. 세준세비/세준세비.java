import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			br.readLine();
			br.readLine();
			int j= -1;
			int b = -1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int temp = Integer.parseInt(st.nextToken());
				j = j>temp ? j : temp;
			}
			
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int temp = Integer.parseInt(st.nextToken());
				b = b>temp ? b :temp;
			}
			
			if(j>=b) {
				bw.write("S\n");
			}else {
				bw.write("B\n");
			}
		}
		
		br.close();
		bw.close();
	}
}