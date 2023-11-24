
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[] = br.readLine().split(" ");
		n = Integer.parseInt(v[0]);

		n%=8;
		
		switch(n) {
		case 7:
			n=3;
			break;
		case 6:
			n=4;
			break;
		case 0:
			n=2;
		}
		bw.write(""+n);
		bw.close();
		br.close();
	}
}