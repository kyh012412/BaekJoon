
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
		
		String v[] = br.readLine().split(" ");
		long a = Long.parseLong(v[0]);
		long ans = (getmap(a)*getmap(a+1))%1000000007;
		
		
		bw.write(""+ ans);
		
		br.close();
		bw.close();
	}
}