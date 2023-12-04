
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int n, k;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		k = Integer.parseInt(st.nextToken());
		outer:for(int i=0;i<k;i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			for(int j=0;j<b;j++) {
				st = new StringTokenizer(br.readLine());
				
				int c=Integer.parseInt(st.nextToken());
				int d=Integer.parseInt(st.nextToken());
				a+=c*d;
			}
			bw.write(a+"");
			bw.newLine();
		}
		
		
		br.close();
		bw.close();
	}
}