import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ans=0;
		
		int idx=0;
		int idx2=0;
		
		String str = br.readLine();
		String str2 = br.readLine();
		
		for(;idx2>=0 && idx2<str2.length();) {
			char targetchar = str.charAt(idx++);
			
			idx2 = str2.indexOf(targetchar,idx2);
			if(idx2==-1) {
				break;
			}
			idx2++;
			if(idx>=str.length()) {
				idx=0;
				ans++;
			}
		}
		
		
		bw.write(ans+"");
		
		br.close();
		bw.close();		
	}
}