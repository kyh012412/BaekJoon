
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			long n = Long.parseLong(br.readLine());
			int newn = (int)(n%1500000); //newn은 주기
		
			if(newn<3) {
				bw.write("1");
				bw.flush();
				br.close();
				return;
			}
			long arr[] = new long[newn+1];
			arr[0]=0;
			arr[1]=1;
			for(int i=2;i<newn+1;i++) {
				arr[i] = (arr[i-1] + arr[i-2])%1000000;
			}
			bw.write(arr[newn]+"");			
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
