import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		String v[] = br.readLine().split(" ");
		
		int before = 0;
		for(int i=0;i<a;i++) {
			int target = Integer.parseInt(v[i]);
			target*=(i+1);
			bw.write(target-before+" ");
			before=target;
		}

		br.close();
		bw.close();
	}
}