
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	
	static int n;
	static HashSet<String> set[]; //n-1번째 평행세계에 대한 F기록들

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		String v[];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append("swimming ");
		}
		bw.write(sb.toString());
		bw.flush();
		
		v = br.readLine().split(" ");
		sb.setLength(0);
		for(int i=0;i<n;i++) {
			if(v[i].equals("bowling")) {
				sb.append("soccer ");
			}else {
				sb.append("bowling ");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}