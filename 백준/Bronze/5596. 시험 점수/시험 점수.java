
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int n;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total[] = new int[2];
		String v[];
		for(int i=0;i<2;i++) {
			v = br.readLine().split(" ");
			for(int j=0;j<4;j++) {
				total[i] += Integer.parseInt(v[j]);
			}
		}
		bw.write(Math.max(total[0], total[1])+"");
		
		bw.close();
		br.close();
	}
}