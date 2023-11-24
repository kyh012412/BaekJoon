
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int a = Integer.parseInt(str);
		for(int i=0;i<a;i++) {
			int b = Integer.parseInt(br.readLine());
			for(int j=0;j<b;j++) {
				bw.write("=");
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();

	}
}
