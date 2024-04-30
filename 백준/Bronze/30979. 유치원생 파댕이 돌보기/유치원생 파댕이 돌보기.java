import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int target = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		String v[] = br.readLine().split(" ");
		int total = 0;
		for(int i=0;i<n;i++) {
			total += Integer.parseInt(v[i]);
		}
		if(target>total) {
			bw.write("Padaeng_i Cry");
		}else {
			bw.write("Padaeng_i Happy");
		}
		
		br.close();
		bw.close();
	}
}