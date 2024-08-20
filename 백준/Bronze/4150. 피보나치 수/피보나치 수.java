import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;

public class Main {
	
	public static HashMap<Integer, BigInteger> map = new HashMap<Integer, BigInteger>();
	
	public static BigInteger getP(int n) {		
		if(!map.containsKey(n)) {
			map.put(n, getP(n-1).add(getP(n-2)));
		}
		return map.get(n);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		map.put(1, BigInteger.valueOf(1));
		map.put(2, BigInteger.valueOf(1));
		
		bw.write(getP(n).toString());
		
		br.close();
		bw.close();
	}
}