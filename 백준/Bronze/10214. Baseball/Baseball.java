
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
		
		int tc = Integer.parseInt(st.nextToken());
		
		for(int tci=0;tci<tc;tci++) {
			int y=0,k=0;
			for(int i=0;i<9;i++) {
				st = new StringTokenizer(br.readLine());
				y+=Integer.parseInt(st.nextToken());
				k+=Integer.parseInt(st.nextToken());				
			}
			if(y>k) {
				bw.write("Yonsei\n");
			}else if(y<k) {
				bw.write("Korea\n");
			}else {
				bw.write("Draw\n");
			}
			bw.flush();
		}
		bw.close();
		br.close();
	}
}