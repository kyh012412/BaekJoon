
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String pikachu[] = {"pi","ka","chu"};
		boolean ischanged = true;
		
		while(ischanged) {
			ischanged=false;
			for(int i=0;i<pikachu.length;i++) {
				if(str.startsWith(pikachu[i])) {
					ischanged=true;
					str = str.replaceFirst(pikachu[i], "");
				}				
			}
			if(!ischanged) {
				break;
			}
		}
		if(str.equals("")) {
			bw.write("YES");
		}else {
			bw.write("NO");
		}		
		
		br.close();
		bw.close();
		
	}
}