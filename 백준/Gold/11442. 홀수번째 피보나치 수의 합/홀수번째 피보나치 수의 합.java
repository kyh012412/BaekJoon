
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	
	public static HashMap<Long, Long> map;
	public static long getmap(long n) {
		if(map.containsKey(n)) {
			return map.get(n);
		}
		if(n<2) {
			map.put(n, n);
			return map.get(n);
		}
		// f(2n) = (f(n-1)+f(n+1))*f(n)
		// f(2n) = (2*f(n-1)+f(n))*f(n)
		// f(2n-1) = f(n)*f(n) + f(n-1)*f(n-1)
		if(n%2==0) {
			n/=2;
			map.put(2*n, ((2*getmap(n-1)+getmap(n))*getmap(n))%1000000007);
			return map.get(2*n);
		}else {
			n = (n+1)/2;
			map.put(2*n-1, (getmap(n)*getmap(n)+getmap(n-1)*getmap(n-1))%1000000007);
			return map.get(2*n-1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		map = new HashMap<Long, Long>();
		
		Long N = Long.parseLong(br.readLine());
		if(N%2==1) N++;
		
		
		bw.write(""+getmap(N));
		br.close();
		bw.close();
	}
}