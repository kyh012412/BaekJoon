import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a,b;
		a=b=0;
		
		for(int i=0;i<3;i++) {
			a+= Integer.parseInt(br.readLine())*(3-i);
		}
		

		for(int i=0;i<3;i++) {
			b+= Integer.parseInt(br.readLine())*(3-i);
		}
		
		if(a>b) {
			bw.write("A");
		}else if(a<b) {
			bw.write("B");
		}else {
			bw.write("T");
		}
		
		bw.close();
		br.close();
	}
}