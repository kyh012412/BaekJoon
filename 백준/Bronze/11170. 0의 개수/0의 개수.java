import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static int getZeroCount(int i) {
		int sum = 0;

		do {
			sum += (i % 10 == 0 ? 1 : 0);
			i /= 10;
		} while (i > 0);

		return sum;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int itc = 0; itc < tc; itc++) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int count = 0;

			for (int i = n; i < m + 1; i++) {
				count += getZeroCount(i);
			}

			bw.write(count + "\n");
		}

		br.close();
		bw.close();
	}
}