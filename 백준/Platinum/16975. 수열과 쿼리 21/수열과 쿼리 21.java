
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long a[] = new long[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N + 1; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "1":
				int s = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken())+1;
				int amount = Integer.parseInt(st.nextToken());
				for(int j=s;j<e;j++) {
					a[j]+=amount;
				}
				break;
			case "2":
				bw.write(""+a[Integer.parseInt(st.nextToken())]);
				bw.newLine();
				break;
			default:
				System.out.println("비이상");
			}
		}

		br.close();
		bw.close();
	}
}