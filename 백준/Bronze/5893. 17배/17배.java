import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str= br.readLine();
		BigInteger a = new BigInteger(str,2).multiply(BigInteger.valueOf(17));
		bw.write(a.toString(2));
		
		br.close();
		bw.close();
	}
}
