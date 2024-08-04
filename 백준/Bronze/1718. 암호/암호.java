import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	
	
	public static char getChar(char origin, char move) {
		if(origin==' ') return ' ';
		char temp = (char)(origin - (move-'a'+1));
		if(temp>='a' && temp <='z') {
			return temp;
		}
		else {
			return temp+=26;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String target = br.readLine();
		String chiper = br.readLine();
		
		StringBuffer ans = new StringBuffer();
		
		for(int i=0;i<target.length();i++) {
			ans.append(getChar(target.charAt(i), chiper.charAt(i%chiper.length())));
		}
		
		bw.write(ans.toString());
		
		br.close();
		bw.close();
	}
}