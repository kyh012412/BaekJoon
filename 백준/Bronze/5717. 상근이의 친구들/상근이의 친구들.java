
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;
	static int m;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String v[] = br.readLine().split(" ");
			n = Integer.parseInt(v[0]);
			m = Integer.parseInt(v[1]);
			if(n==0 && m==0) {
				break;
			}
			bw.write(n+m+"");
			bw.newLine();
		}

		bw.close();
		br.close();
	}
}