import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v[] = br.readLine().split(" ");
		
		int myTime = Integer.parseInt(v[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count=0;
		
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp>myTime) {
				break;
			}
			myTime -= temp;
			count++;
		}
		
		bw.write(count+"");		

		br.close();
		bw.close();
	}
}