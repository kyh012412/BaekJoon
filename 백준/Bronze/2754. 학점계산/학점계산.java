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
			double score = 0;
			switch (str.charAt(0)) {
			case 'A':
				score = 4.0;
				break;
			case 'B':
				score = 3.0;
				break;
			case 'C':
				score = 2.0;
				break;
			case 'D':
				score = 1.0;
				break;
			case 'F':
				score = 0.0;
				break;
			default:
				break;
			}
			if (str.length() != 1) {
				switch (str.charAt(1)) {
				case '+':
					score += 0.3;
					break;
				case '-':
					score -= 0.3;
				default:
					break;
				}
			}

			String strf = String.format("%.1f", score);
			bw.write(strf);

			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}