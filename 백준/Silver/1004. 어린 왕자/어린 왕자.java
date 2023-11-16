
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int count = 0;
	static int xyxy[][];
	static int bc;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());// 테스트 케이스의 수 test case
		String v[];
		int cc; // 원의 개수 circle count;
		for (int itc = 0; itc < tc; itc++) {
			xyxy = new int[2][2];
			v = br.readLine().split(" ");
			int idx = 0;

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					xyxy[i][j] = Integer.parseInt(v[idx++]);
				}
			}

			bc = 0; // 경계선 수 boundary count
			cc = Integer.parseInt(br.readLine());
			for (int i = 0; i < cc; i++) {
				calbc(br.readLine());
			}
			bw.write(bc+"");
			bw.newLine();
		}

		bw.close();
		br.close();
	}

	public static void calbc(String str) {
		String v[] = str.split(" ");
		int x = Integer.parseInt(v[0]);
		int y = Integer.parseInt(v[1]);
		int r = Integer.parseInt(v[2]);
		
		bc+=calincircle(x, y, r);
	}

	public static int calincircle(int x, int y, int r) {
		boolean isin[] = new boolean[2];
		for (int i = 0; i < 2; i++) {
			if ((Math.pow(x - xyxy[i][0], 2) + Math.pow(y - xyxy[i][1], 2) - Math.pow(r, 2) < 0)) {
				isin[i]=true;
			}else {
				isin[i]=false;
			}
		}
		if(isin[0]&&!isin[1]) {
			return 1;
		}else if(isin[1]&&!isin[0]){
			return 1;
		}else {
			return 0;
		}
	}
}