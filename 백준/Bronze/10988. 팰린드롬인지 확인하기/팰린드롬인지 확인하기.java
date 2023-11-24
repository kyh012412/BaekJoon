import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br;
		BufferedWriter bw;
		try {
			boolean p= true;
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String str= br.readLine();
			int len = str.length();
			for(int i=0;i<len/2;i++) {
				if(str.charAt(i)!=str.charAt(len-1-i)) {
					p=false;
					break;
				}
			}
			if(p) {
				bw.write(Integer.toString(1));
			}else {
				bw.write(Integer.toString(0));
			}
			bw.flush();
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}