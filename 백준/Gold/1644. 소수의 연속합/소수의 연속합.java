
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;
	static int count=0;
	static int arr[];// 소수들을 담을 배열 최대 2000;
	static int idx = 0;
	static int lidx = 0, ridx = 0;
	static boolean che[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		che = new boolean[n + 1]; //소수는 false로 남고 소수가아닌수는 true
		arr = new int[n+1];//소수들이 들어있음
		if(n==1) {
			bw.write("0");
			bw.close();
			return;
		}
		// 체 만들기
		int i = 2;
		while (true) {
			if (!che[i]) {
				arr[idx++] = i;
//				System.out.println(i);
				int ii = i * i;
				while (true) {
					if (ii > n || ii <= 0) {
//						System.out.println(ii);
//						System.out.println(ii);
						break;
					}
					che[ii] = true;
					ii += i;
				}
			}
			i++;
			if (i> n) {
				break;
			}
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(idx);

		int totalsum = 0;
		while (!(ridx == idx && lidx == idx)) {
			if (totalsum < n) {
				if (ridx < idx) {
					totalsum += arr[ridx++];
				}else {
					break;
				}
			} else if (totalsum == n) {
				count++;
				if (ridx < idx) {
					totalsum += arr[ridx++];
				}
				if (lidx < idx) {
					totalsum -= arr[lidx++];
				}
			} else if (totalsum > n) {
				if (lidx < idx) {
					totalsum -= arr[lidx++];
				}
			}
//			System.out.println(totalsum+" "+lidx+" "+ridx+" "+idx);
		}
		
		bw.write(count+"");

		bw.flush();
		br.close();
	}
}