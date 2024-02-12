
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		long a[]= new long[3];
		for(int i=0;i<3;i++) {
			a[i]=Long.parseLong(st.nextToken());			
		}
		if(a[1]>a[2]) {
			bw.write(a[0]*a[1]/a[2]+"");
		}else {
			bw.write(a[0]*a[2]/a[1]+"");
		}
		
		bw.close();
		br.close();
	}
}