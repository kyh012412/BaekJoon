import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringBuffer encrypted = new StringBuffer();
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			a%=26;
			int b = Integer.parseInt(st.nextToken());
			b%=26;
			
			String PlainText = br.readLine();
			for(int j=0;j<PlainText.length();j++) {
				char c = PlainText.charAt(j);
				int numc = c-'A';
				char encrytedC = (char)((a*numc + b)%26+'A');
				encrypted.append(encrytedC);
			}
			encrypted.append("\n");
		}
		
		bw.write(encrypted.toString());

		br.close();
		bw.close();
	}
}