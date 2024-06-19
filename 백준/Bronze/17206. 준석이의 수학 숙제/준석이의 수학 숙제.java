import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {	

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc=Integer.parseInt(br.readLine());
		
		int a[] = new int[80001];
		
		int temp = 25;
		
		//기본적인 셋업
		for(int i=10;i<80001;i++) {
			if(i%3==0 || i%7==0) {
				temp+=i;
			}
			a[i]=temp;
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			bw.write(a[num]+"\n");
		}
		
		br.close();
		bw.close();
	}
}