
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
			int count =0; //0이 아닌글자의 개수
			int sum=0; //3의배수인지 검사를위한 각자리 숫자들의합
			int b[] = new int[10];
			int num;
			for(int i=0;i<str.length();i++) {
				num = (int)(str.charAt(i)-'0');
				if(num!=0) {
					count++;
				}
				sum+=num;
				sum%=3;
				b[num]++;
			}
			if(count==str.length() || sum!=0) {
				bw.write("-1");
				bw.flush();
				br.close();
				return;
			}
			String towrite= "";
			for(int i=9;i>=0;i--) {
				while(b[i]!=0) {
					towrite+=""+i;
					b[i]--;
				}
			}
			bw.write(towrite);
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}		
	}
}
