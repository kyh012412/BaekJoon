
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;
	static int vals[][];
	static int cals[][];
	static int r;
	static int c;

	public static void setcalwithrc(int r, int c) {
		cals = new int[n + 1][n + 1];
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (i == 1) {
					cals[i][j] = cals[i][j - 1] + vals[i][j];
				} else if (j == 1) {
					cals[i][j] = cals[i - 1][j] + vals[i][j];
				} else {
					cals[i][j] = Math.max(cals[i][j - 1], cals[i - 1][j]) + vals[i][j];
				}
			}
		}
		for (int i = r; i <= n; i++) {
			for (int j = c; j <= n; j++) {
				if (i == r && j == c) {
					continue;
				} else if (i == r) {
					cals[i][j] = cals[i][j - 1] + vals[i][j];
				} else if (j == c) {
					cals[i][j] = cals[i - 1][j] + vals[i][j];
				} else {
					cals[i][j] = Math.max(cals[i][j - 1], cals[i - 1][j]) + vals[i][j];
				}
			}
		}
	}

	public static void setcalwithoutrc(int r, int c) {
		cals = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == r && j == c) {
					cals[i][j] = -2000000000;
				} else if (i == 1) {
					cals[i][j] = cals[i][j - 1] + vals[i][j];
				} else if (j == 1) {
					cals[i][j] = cals[i - 1][j] + vals[i][j];
				} else {
					cals[i][j] = Math.max(cals[i][j - 1], cals[i - 1][j]) + vals[i][j];
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		vals = new int[n + 1][n + 1];

		String v[];
		for (int i = 0; i < n + 1; i++) {
			if (i == 0)
				continue;
			v = br.readLine().split(" ");
			for (int j = 0; j < n + 1; j++) {
				if (j == 0)
					continue;
				vals[i][j] = Integer.parseInt(v[j - 1]);
			}
		}
		v = br.readLine().split(" ");
		r = Integer.parseInt(v[0]);
		c = Integer.parseInt(v[1]);

		setcalwithrc(r, c);

		bw.write(cals[n][n] + " ");

		setcalwithoutrc(r, c);

		bw.write(cals[n][n] + "");

		bw.close();
		br.close();
	}
}