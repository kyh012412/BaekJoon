
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static boolean ispal(String str) {
		StringBuilder sb1 = new StringBuilder(str);
		

		if(sb1.toString().equals(sb1.reverse().toString())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isoncharonly(String str) {
		char c =str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str2 = br.readLine();
		outer:for(int i=str2.length();i>=2;i--) {
			for(int j=0;;j++) {
				if(j+i<=str2.length()) {
					if(!ispal(str2.substring(j,j+i))) {
						bw.write(""+str2.substring(j,j+i).length());
						bw.close();
						return;
					}else if(isoncharonly(str2)){
						bw.write("-1");
						bw.close();
						return;
					}else {
						continue;
					}
				}else {
					continue outer;
				}
			}
		}
//		System.out.println(ispal("ABCB"));
		
		bw.write("-1");

		bw.close();
		br.close();
	}
}