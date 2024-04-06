import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());// x
		int m = Integer.parseInt(st.nextToken());// o
		int k = Integer.parseInt(st.nextToken());// o
		n = n - m;// x
		int l = m + n - k;
		int max = Math.min(k, m) + Math.min(n, l);

		bw.write(max + "");

		br.close();
		bw.close();
	}
}