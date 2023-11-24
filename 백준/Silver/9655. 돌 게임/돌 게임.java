
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		String v[];
		v = br.readLine().split(" ");
		int a = Integer.parseInt(v[0]);		
		a%=4;
		if(a==1 || a==3) {
			bw.write("SK");
		}else {
			bw.write("CY");
		}
		
		bw.close();
		br.close();
	}
}
