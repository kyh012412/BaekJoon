
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
			int b = Integer.parseInt(str.split(" ")[1]);
			int c = Integer.parseInt(str.split(" ")[2]);
			
			int d = c/b;
			int e = c%b;
			
			bw.write(d+ " "+e);
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}