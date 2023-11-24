import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String str = br.readLine();
			long num1 = Long.parseLong(str.split(" ")[0]);
			long num2 = Long.parseLong(str.split(" ")[1]);
			long min = num1<num2?num1:num2;
			long bcd=-1; //최대공약수
			
			for(long i=min;i>=1;i--) {
				if(num1%i==0 && num2%i==0) {
					num1/=i;
					num2/=i;
					bcd=i;
					break;
				}
			}
			
			bw.write(""+(num1*num2*bcd));
			
			
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}