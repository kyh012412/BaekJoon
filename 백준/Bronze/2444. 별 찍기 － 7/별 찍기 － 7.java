import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader br;
		BufferedWriter bw;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int a=  Integer.parseInt(br.readLine());
			for(int i=0;i<a;i++) {
				for(int j=a-1-i;j>0;j--) {
					bw.write(" ");
				}
				for(int j=0;j<2*i+1;j++) {
					bw.write("*");
				}
				bw.newLine();
			}
			for(int i=a-2;i>=0;i--) {
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
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}