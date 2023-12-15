
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int won = Integer.parseInt(br.readLine());
		int minwon = won;
		if(n>=5) {
			minwon = Math.min(minwon,won-500>0?won-500:0);
		}
		
		if(n>=10) {
			minwon = Math.min(minwon,(int)(won*0.9));
		}
		
		if(n>=15) {
			minwon = Math.min(minwon,won-2000>0?won-2000:0);
		}
		
		if(n>=20) {
			minwon = Math.min(minwon,(int)(won*0.75));
		}
		
		bw.write(minwon+"");

		bw.close();
		br.close();
	}
}