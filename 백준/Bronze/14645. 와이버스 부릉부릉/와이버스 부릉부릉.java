import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			for(int i=0;i<a;i++) {
				br.readLine();
			}
			bw.write("비와이");
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}		
	}
}
