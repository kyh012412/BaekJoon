
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=0;i<3;i++) {
			int tc = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			for(int j=0;j<tc;j++) {
				sum = sum.add(new BigInteger(br.readLine()));
			}
			if(sum.equals(new BigInteger("0"))) {
				bw.write("0");
				bw.newLine();
				continue;
			}else if(sum.toString().charAt(0)=='-'){
				bw.write("-");
				bw.newLine();
				continue;
			}else {
				bw.write("+");
				bw.newLine();
				continue;
			}
		}
		
		bw.close();
		br.close();
	}
}
