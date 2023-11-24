import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String str = br.readLine();
			int a = Integer.parseInt(str);
			outer:for (int i=0;i<a;i++) {
				long b=Long.parseLong(br.readLine());
				second:for(long j=b;;j++) {
					if(j == 2 || j== 3) {
						bw.write(""+j);
						bw.newLine();
						continue outer;
					}
					for(long k=2;k<=Math.sqrt(j);k++) {
						if(j%k==0) {
							continue second;
						}else if(k+1>Math.sqrt(j) ){
							bw.write(""+j);
							bw.newLine();
							continue outer;
						}
					}
				}
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}