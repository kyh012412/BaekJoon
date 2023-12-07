import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		if(str.equals("n") || str.equals("N")) {
			bw.write("Naver D2");
		}else {
			bw.write("Naver Whale");
		}
		
		br.close();
		bw.close();
	}
}