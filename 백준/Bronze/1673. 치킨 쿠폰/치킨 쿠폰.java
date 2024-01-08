import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str,v[];
		StringBuilder sb = new StringBuilder();
		while((str=br.readLine())!=null) {
			v = str.split(" ");
			long n = Long.parseLong(v[0]);
			long k = Long.parseLong(v[1]); //스탬프가 필요한 개수
			long more =n;
			long stamp=n;
			while(stamp>=k) {
				stamp++;
				stamp-=k;
				more++;
			}
			sb.append(more+"\n");
		}
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
