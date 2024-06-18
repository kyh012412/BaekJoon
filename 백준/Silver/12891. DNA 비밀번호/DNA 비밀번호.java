import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {	
	public static int a,c,g,t;
	public static int ans=0;
	public static int ch[] = new int[26];
	
	public static void check() {
		if(ch['A'-'A']<a) {
			return;
		}
		if(ch['C'-'A']<c) {
			return;
		}
		if(ch['G'-'A']<g) {
			return;
		}
		if(ch['T'-'A']<t) {
			return;
		}
		ans++;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[] = br.readLine().split(" ");

		int s = Integer.parseInt(v[0]);
		int p = Integer.parseInt(v[1]);
		
		String str= br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		g=Integer.parseInt(st.nextToken());
		t=Integer.parseInt(st.nextToken());

		int startidx=0;
		int endidx=0;
		
		
		while(true) {
			if(endidx>s-1) break;
						
			ch[str.charAt(endidx++)-'A']++;
			if(endidx>=p) {
				check();
				ch[str.charAt(startidx++)-'A']--;
			}
		}
		
		bw.write(ans+"");
		
		
		br.close();
		bw.close();
	}
}
