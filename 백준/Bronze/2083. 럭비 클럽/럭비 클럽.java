import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String str=br.readLine();
			if(str.charAt(0)=='#') {
				break;
			}
			String v[] = str.split(" ");
			int age = Integer.parseInt(v[1]);
			int weight = Integer.parseInt(v[2]);
			if(age>17 || weight>=80) {
				bw.write(v[0]+" "+"Senior\n");
			}else {
				bw.write(v[0]+" Junior\n");
			}				
		}

		br.close();
		bw.close();
	}
}