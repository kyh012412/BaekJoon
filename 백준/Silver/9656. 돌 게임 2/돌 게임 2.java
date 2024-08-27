import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String ans= "SK";
		
		switch((n-1)%4) {
		case 1:
		case 3:
			break;
		default:
			ans = "CY";			
		}
		
		bw.write(ans);		
		
		br.close();
		bw.close();
	}
}