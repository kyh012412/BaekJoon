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
			int a[] = new int[3];
			for(int i=0;i<3;i++) {
				a[i] = Integer.parseInt(str.split(" ")[i]);
			}
			
			int num = Integer.parseInt(br.readLine());
			int b[] = new int[3];
			

			b[2] = num%60;
			num-= num%60;
			if(num>59) {
				num/=60;
			}

			b[1] = num%60;
			num-= num%60;
			if(num>59) {
				num/=60;
			}
			if(num>23) {
				num%=24;
			}
			b[0]=num;
			num-= num%24;
			for(int i=0;i<3;i++) {
				a[i] += b[i];
			}
			while(a[0]>23 || a[1] >59 || a[2]>59) {
				
				if(a[2]>59) {
					a[2]-=60;
					a[1]++;
				}
				if(a[1]>59) {
					a[1]-=60;
					a[0]++;
				}				
				if(a[0]>23) {
					a[0]-=24;
				}
			}
			
			for(int c:a) {
				bw.write(c+" ");
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}		
	}
}