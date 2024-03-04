import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String v[] = br.readLine().split(" ");
			v[0] = "god";
			String str = "";
			for(String s : v) {
				str+=s;
			}
			bw.write(str+"\n");
		}

		br.close();
		bw.close();
	}
}