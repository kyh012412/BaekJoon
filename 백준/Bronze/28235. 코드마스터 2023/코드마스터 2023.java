
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		switch (br.readLine()) {
		case "SONGDO":
			bw.write("HIGHSCHOOL");
			break;
		case "CODE":
			bw.write("MASTER");
			break;
		case "2023":
			bw.write("0611");
			break;
		case "ALGORITHM":
			bw.write("CONTEST");
			break;
		default:
			break;
		}

		bw.close();
		br.close();
	}
}