
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		int a = Integer.parseInt(v[0]);
		int b = Integer.parseInt(v[1]);
		
		int c[] = new int[a];
		v = br.readLine().split(" ");
		for(int i=0;i<a;i++) {
			c[i] =Integer.parseInt(v[i]);
		}
		Arrays.sort(c);
		int idx=0;
		while(true) {
			if(b>=c[idx]) {
				idx++;
				b++;
				if(idx==c.length) {
					break;
				}
			}else {
				break;
			}
		}
		
		bw.write(""+b);
		
		
		bw.close();
		br.close();
	}
}
