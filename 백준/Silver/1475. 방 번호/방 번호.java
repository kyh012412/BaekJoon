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
			String str = br.readLine();
			int b[] = new int[10];
			for(int i=0;i<str.length();i++) {
				int a = (str.charAt(i)-'0');
//				System.out.println(a);
				b[Integer.parseInt(a+"")]++;				
			}
//			System.out.println();
			b[6]+=b[9];
			if(b[6]%2==0) {
				b[6]=b[6]/2;
			}else {
				b[6]=b[6]/2+1;				
			}
			b[9]=b[6];
			int a = Arrays.stream(b).max().getAsInt();
			bw.write(""+a);
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
