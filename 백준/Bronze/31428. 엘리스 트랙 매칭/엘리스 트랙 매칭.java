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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String et = br.readLine();
		int ans=0;
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals(et)) {
				ans++;
			}
		}
		
		bw.write(ans+"");

		br.close();
		bw.close();
	}
}