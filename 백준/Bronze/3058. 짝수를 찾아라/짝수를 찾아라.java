
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int tc = Integer.parseInt(br.readLine());
		for(int tci=0;tci<tc;tci++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int total=0;
			int min=100;
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				if(num%2==0) {
					if(num<min) {
						min=num;
					}
					total+=num;
				}
			}
			bw.write(total+" "+min);
			bw.newLine();
		}

		bw.close();
		br.close();
	}
}