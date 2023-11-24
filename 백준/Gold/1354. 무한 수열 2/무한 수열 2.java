
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static HashMap<Long, Long> map = new HashMap<Long, Long>();
	
	static long n;
	static long p;
	static long q;
	static long x;
	static long y;
	
	public static long getval(long key) {
		if(key<=0) return 1;
		
		if(map.containsKey(key))
			return map.get(key);

		long val1 = getval((long)(Math.floor(key/p)-x));
		long val2 = getval((long)(Math.floor(key/q)-y));
		
		map.put(key, val1+val2);
		
		return map.get(key);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[] = br.readLine().split(" ");
		
		n = Long.parseLong(v[0]);
		p = Long.parseLong(v[1]);
		q = Long.parseLong(v[2]);
		x = Long.parseLong(v[3]);
		y = Long.parseLong(v[4]);
		
		bw.write(""+getval(n));	

		bw.close();
		br.close();
	}
}