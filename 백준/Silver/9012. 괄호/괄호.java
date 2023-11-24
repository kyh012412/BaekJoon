
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int tc= Integer.parseInt(br.readLine());
			for(int i=0;i<tc;i++) {
				String temp = br.readLine();
				while(true) {
					temp = temp.replace("()", "");
					if(!temp.contains("()")) {
						break;
					}
				}
				if(temp.equals("")) {
					bw.write("YES");
					bw.newLine();
				}else {
					bw.write("NO");
					bw.newLine();
				}
			}
            
			bw.flush();
			br.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}