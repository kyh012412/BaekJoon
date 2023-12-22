
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			for(int j=i;j+1<n;j++) {
				sb.append(" ");
			}
			for(int j=0;j-1<i;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
