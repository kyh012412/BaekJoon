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
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);

			str = br.readLine();
			int c = Integer.parseInt(str.split(" ")[0]);
			int d = Integer.parseInt(str.split(" ")[1]);
			
			
			int newb = b*d;
			int newa = a*d+c*b;
			
			int min = newa<newb?newa:newb;
			
			for(int i=min ;i>=1;i--) {
				if(newb%i==0 && newa%i==0) {
					newb/=i;
					newa/=i;
					break;
				}
			}
			bw.write(newa + " "+ newb);
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}