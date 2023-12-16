
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char a = str.charAt(i);
			a = (char)(a-3);
			if(a<'A') {
				a=(char)(a+26);
			}
			sb.append(a);
		}
		
		bw.write(sb.toString());

		bw.close();
		br.close();
	}
}