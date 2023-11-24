
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static long a;
	static long b;
	static long c;
	static long d;
	
	public static boolean isarithmetic(long k) {
		if((k-a)%b==0 && (k-a)/b>=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v[] = br.readLine().split(" ");
		a = Long.parseLong(v[0]);
		b = Long.parseLong(v[1]);
		c = Long.parseLong(v[2]);
		d = Long.parseLong(v[3]);
		long u = Long.parseLong(v[4]);
		long idx=0;
		long count=0;
		
		long max = (long)Math.floor((1.0)*(u-a)/b);
		if(max>=0)
		count = max+1;
		while(true) {
			if(c*Math.pow(d,idx)<=u) {
				if(!isarithmetic((long)(c*Math.pow(d,idx)))) {
					count++;
				}
				if(d==1) {
					break;
				}
			}else {
				break;
			}
			idx++;
		}
		
		bw.write(""+count);
		
		br.close();
		bw.close();
	}
}