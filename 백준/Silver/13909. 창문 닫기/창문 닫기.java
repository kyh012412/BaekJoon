
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
//		boolean isopended[] = new boolean[n+1];
		int count=0;
		for(int i=1;i*i<=n;i++) {//i의 배수인 창문들위치
			count++;
		}
		
		bw.write(""+count);
		
		bw.close();
		br.close();
	}
}