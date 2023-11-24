
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			String v[] = br.readLine().split(" ");
			int a = Integer.parseInt(v[0]);
			int b = Integer.parseInt(v[1]);
			int gop=1;
			for(int j=b;j>0;j--) {
				gop = (gop*a)%10;
			}
			if(gop==0) {
				bw.write("10");
			}else {
				bw.write(""+gop);
			}
			bw.newLine();
		}

		bw.close();
		br.close();
	}
}