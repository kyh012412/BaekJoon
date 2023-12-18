
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = new String[8];
		int count=0;
		
		for(int i=0;i<str.length;i++) {
			str[i]= br.readLine();
			for(int j=0;j<str[i].length();j++) {
				if((i+j)%2==0 && str[i].charAt(j)=='F') {
					count++;
				}
			}
		}
		
		bw.write(count+"");

		bw.close();
		br.close();
	}
}