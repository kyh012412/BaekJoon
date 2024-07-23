import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int n = Integer.parseInt(str);
		int m = Integer.parseInt(st.nextToken());
		int len =0;
		int count=n;
		StringBuffer sb = new StringBuffer();
		
		outer:while(true) {
			for(int i=0;i<str.length();i++) {
				sb.append(str.charAt(i));
				len++;
				if(len==m) break outer;
				
			}
			count--;
			if(count==0) {
				break outer;
			}
		}
		
		bw.write(sb.toString());

		br.close();
		bw.close();
	}
}