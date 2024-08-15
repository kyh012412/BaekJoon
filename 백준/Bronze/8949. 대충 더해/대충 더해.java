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
		String a = st.nextToken();
		String b = st.nextToken();
		
		// make same length;
		while(a.length()<b.length()) {
			a = "0"+a;
		}
		
		while(a.length()>b.length()) {
			b = "0"+b;
		}
		
		// make answer
		for(int i=0;i<a.length();i++) {
			bw.write(a.charAt(i)-'0'+b.charAt(i)-'0'+"");
		}
		
		br.close();
		bw.close();
	}
}