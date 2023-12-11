
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[];
		int s,k;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		s = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[k];
		int remain = s%k;
		long gop = 1;
		
		for(int i=0;i<k;i++) {
			arr[i] = s/k;
			if (remain>0) {
				remain--;
				arr[i]++;
			}
			gop*=arr[i];
		}
		
		bw.write(gop+"");

		bw.close();
		br.close();
	}
}