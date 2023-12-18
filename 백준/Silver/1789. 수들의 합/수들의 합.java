
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long s = Long.parseLong(br.readLine());
		
		int idx = 1;
		int count=0;
		while(s>=0) {
			s-=idx;
			count++;
			if(s>=0) {
				idx++;
			}else {
				count--;
				break;
			}
		}
		
		bw.write(count+"");		
		
		br.close();
		bw.close();
	}
}