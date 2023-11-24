import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int a[] = new int[5];
			int b=0;
			
			for(int i=0;i<5;i++) {
				a[i] = Integer.parseInt(br.readLine());
				b+=a[i];
			}
			
			Arrays.sort(a);
			
			bw.write(""+(b/5));
			bw.newLine();
			bw.write(""+a[2]);
			
//			String str;
//			str = br.readLine();//1
//			int casecount = Integer.parseInt(str);
		
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}