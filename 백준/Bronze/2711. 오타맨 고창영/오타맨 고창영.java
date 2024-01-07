import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String v[];
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<n;i++) {
			v = br.readLine().split(" ");
			int nth = Integer.parseInt(v[0])-1;
			sb.append(v[1].substring(0,nth));
			sb.append(v[1].subSequence(nth+1, v[1].length()));
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
