import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {			
			String str;
			str = br.readLine();//1
			int len = str.length();
		
			int a[]=str.chars().sorted().toArray();
			String str2="";
			for(int i=len-1;i>=0;i--) {
				str2+=""+(char)a[i];
			}
		
			bw.write(str2);
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}