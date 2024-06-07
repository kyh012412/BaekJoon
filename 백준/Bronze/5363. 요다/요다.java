import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		
		for(int i=0;i<a;i++) {
			String v[] = br.readLine().split(" ");
			for(int j=0;j<v.length;j++) {
				bw.write(v[(j+2)%v.length]+" ");
			}
			bw.write("\n");
		}

		br.close();
		bw.close();
	}
}