
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BigInteger N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			N = new BigInteger(br.readLine());
			if(N.compareTo(BigInteger.ZERO)==0) {
				break;
			}
			getroot();
			bw.write(N.toString()+"\n");
		}
		
		bw.close();
		br.close();
	}
	
	public static void getroot() {
		long sum=0;
		if(N.compareTo(BigInteger.valueOf(10))<0) {
			return ;
		}
		
		String temp = N.toString();
		for(int i=0;i<temp.length();i++) {
			sum += temp.charAt(i)-'0';
		}
		N = BigInteger.valueOf(sum);
		
		getroot();
		
	}
}