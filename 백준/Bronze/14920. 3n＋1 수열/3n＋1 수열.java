import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int index=1;
		
		while(n!=1) {
			switch(n%2) {
			case 0:
				n/=2;
				break;
			case 1:
				n=3*n+1;
				break;
			}
			index++;
		}
		
		bw.write(index+"");

		br.close();
		bw.close();
	}
}