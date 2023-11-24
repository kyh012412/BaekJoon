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
			
			for(int i=a-1;i>=0;i--) {
				for(int j=a-1-i;j>0;j--) {
					bw.write(" ");
				}
				for(int j=0;j<2*i+1;j++) {
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
