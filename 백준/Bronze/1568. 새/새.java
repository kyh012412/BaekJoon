import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int ans=0;
		
		int now=1;
		while(n>0) {
			if(now<=n) {
				n-=now;
				ans++;
				now++;
			}else {
				now=1;
			}
		}

		bw.write(ans+"");
		
		br.close();
		bw.close();
	}
}