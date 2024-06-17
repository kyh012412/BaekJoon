import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[] = br.readLine().split(" ");

		BigInteger P = new BigInteger(v[0]);

		int k = Integer.parseInt(v[1]);

		boolean che[] = new boolean[k + 1];

		int idx = 2;

		// 소수가 아닌수는 true로 변경
		outer: while (idx <= k) {
			// idx가 소수이면
			if (!che[idx]) {
				int ban = idx * idx;
				if (ban <= 0) {
					idx++;
					continue outer;
				}
				while (ban <= k) {
					che[ban] = true;
//					System.out.println("ban " + ban);
					ban += idx;
					if (ban <= 0) {
						idx++;
						continue outer;
					}
				}
			}
			idx++;
		}

		int save = -1;
		for (int i = 2; i < k; i++) {
			if (che[i])
				continue;
			if (P.divideAndRemainder(BigInteger.valueOf(i))[1].intValue() == 0) {
				save = i;
				break;
			}
		}

		if (save == -1) {
			bw.write("GOOD");
		} else {
			bw.write("BAD " + save);
		}

		br.close();
		bw.close();
	}
}
/*
 * 
7254448772055042927672544487720550429276725444877205504292767254448772055042927672544487720551429237 999961
 * 
 */