import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		TreeSet<String> set = new TreeSet<String>();
		
		try {
			String str = br.readLine();
			int maxlen = str.length();
			int len=1;
			
			while(true) {
				for(int i=0;i<maxlen-len+1;i++) {
					String sub = str.substring(i,i+len);
					if(set.contains(sub)) {
						
					}else {
						set.add(sub);
					}
				}
				len++;
				if(len>maxlen) {
					break;
				}
			}
			String towrite = "";
			bw.write(towrite+set.size());

			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}