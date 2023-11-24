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
			
			int a= Integer.parseInt(str.split(" ")[0]);
			int b= Integer.parseInt(str.split(" ")[1]);
			int c= Integer.parseInt(br.readLine());
			int d= Integer.parseInt(br.readLine());
			if(a>c) {
				bw.write("0");
			}else if(a==c) {
				if(b<=0) {
					bw.write("1");
				}else {
					bw.write("0");
				}
			}else {
				if((c-a)*d>=b) {
					bw.write("1");
				}else {
					bw.write("0");
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