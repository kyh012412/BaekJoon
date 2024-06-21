import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for(int i=1;i<=n;i++) {
			String s = i+"";
			String v[] = s.split("");
			int temp=0;
			for(int j=0;j<v.length;j++) {
				temp+=Integer.parseInt(v[j]);
			}
			if(i%temp==0) {
				ans++;
			}
		}
		
		bw.write(ans+"");

		br.close();
		bw.close();
	}
}