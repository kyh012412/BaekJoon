
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//		int a = Integer.parseInt(br.readLine().split(" ")[0]);
		String v[] = br.readLine().split(" ");
		double a = Double.parseDouble(v[0]);
//		double b = Double.parseDouble(v[1]);
//		double c = Double.parseDouble(v[2]);

		for (int i = 0; i < a; i++) {
			if(i%2==1) {bw.write(" ");}
			for(int j=0;j<a;j++) {
				bw.write("* ");
			}
			bw.newLine();
		}
//		for (int i =(int) a-2; i >=0; i--) {

//		}

		bw.close();
		br.close();
	}
}
