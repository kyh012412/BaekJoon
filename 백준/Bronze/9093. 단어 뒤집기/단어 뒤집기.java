import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++) {
				String v[] = br.readLine().split(" ");
				for(int j=0;j<v.length;j++) {
					StringBuilder sb = new StringBuilder(v[j]);
					bw.write(sb.reverse().toString()+" ");
				}
				bw.newLine();
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
