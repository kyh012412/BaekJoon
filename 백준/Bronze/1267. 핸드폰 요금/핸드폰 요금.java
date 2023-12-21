
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int y = 0;
		int m = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			y += (num+30)/30*10;
			m += (num+60)/60*15;
		}
		
		if(y<m) {
			bw.write("Y "+y);
		}else if(y>m){
			bw.write("M "+m);
		}else {
			bw.write("Y M "+y);
		}

		br.close();
		bw.close();

	}
}