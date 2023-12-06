
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n, k;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		int A = p*a;
		int B = b;
		p-=c;
		if(p>0) {
			B+=p*d;
		}
		int min = A<B?A:B;
		bw.write(min+"");
		
		br.close();
		bw.close();
	}
}