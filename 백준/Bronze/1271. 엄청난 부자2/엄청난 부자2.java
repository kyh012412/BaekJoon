import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			
			BigInteger a = new BigInteger(str.split(" ")[0]);
			BigInteger b = new BigInteger(str.split(" ")[1]);
			
			BigInteger c[] = a.divideAndRemainder(b);
			
			bw.write(""+c[0].toString());
			bw.newLine();
			bw.write(""+c[1].toString());
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}