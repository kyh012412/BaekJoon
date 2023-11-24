
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String v[] = new String[2];
			for(int i=0;i<2;i++) {
				v[i] = br.readLine();
			}
			String str = "";
			for(int i=0;i<8;i++) {
				for(int j=0;j<2;j++) {
					str+=v[j].charAt(i);
				}
			}
			int a[] = new int[16];
			for(int i=0;i<16;i++) {
				a[i] = (int)(str.charAt(i)-'0');
			}
			
			for(int i=15;i>1;i--) {
				for(int j=0;i!=j;j++) {
					a[j]=(a[j]+a[j+1])%10;
				}
			}
			bw.write(a[0]+""+a[1]);
			
			//작업하는 파일명 확인
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}