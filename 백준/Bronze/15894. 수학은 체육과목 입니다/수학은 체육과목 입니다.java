import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			long a = Long.parseLong(br.readLine());
			bw.write(""+(a*4));
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}