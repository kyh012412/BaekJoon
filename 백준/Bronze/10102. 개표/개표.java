import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int a, b;
		a = b = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
				a++;
				break;
			case 'B':
				b++;
				break;
			}
		}
		if(a>b) {
			bw.write("A");
		}else if(a<b) {
			bw.write("B");
		}else {
			bw.write("Tie");
		}

		br.close();
		bw.close();
	}

}