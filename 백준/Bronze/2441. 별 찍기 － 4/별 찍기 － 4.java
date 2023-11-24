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
			int a = Integer.parseInt(str);
			
			for(int i=0;i<a;i++) {
				for(int j=0;j<i;j++) {
					bw.write(" ");
				}
				
				for(int j=a-i;j!=0;j--) {
					bw.write("*");
				}
				bw.newLine();
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}