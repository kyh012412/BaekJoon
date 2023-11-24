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
			int a = Integer.parseInt(str);
			
			int b[] = new int[a];
			int c[] = new int[a-1];
			int min = 1000000000;
			for(int i=0;i<a;i++) {
				b[i] = Integer.parseInt(br.readLine());
				if(i!=0) {
					c[i-1] = b[i]-b[i-1];
					if(min>c[i-1]) {
						min=c[i-1];
					}
				}
			}
			int idx=min;
			int gcd;
			outer:while(true) {
				for(int i=0;i<c.length;i++) {
					if(c[i]%idx!=0) {
						idx--;
						continue outer;
					}else if(i==c.length-1) {
						gcd=idx;
						break outer;
					}
				}
			}
			int sum =0;
			for(int d : c) {
				sum += d/gcd -1;
			}
			
			bw.write(""+sum);
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}