import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int s[] = {100,100};
		StringTokenizer st;
		int num[] = new int[2];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			if(num[0]>num[1]) {
				s[1]-=num[0];
			}else if(num[0]<num[1]){
				s[0]-=num[1];
			}
		}
		bw.write(s[0]+"\n"+s[1]);

		br.close();
		bw.close();
	}
}
