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
			
			String vals[] = str.split(" ");
			
			int a[] = new int[vals.length];
			int sum=0;
			
			for(int i=0;i<a.length;i++) {
				a[i]=Integer.parseInt(vals[i]);
				sum += (a[i]*a[i])%10;
			}
			
			bw.write(""+ (sum%10));
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}