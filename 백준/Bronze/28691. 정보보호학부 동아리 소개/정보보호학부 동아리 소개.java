
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	static int n;
	static ArrayList<Integer> list;
	static long sum=0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		
		switch(v[0]) {
		case "M":
			bw.write("MatKor");
			break;
		case "W":
			bw.write("WiCys");
			break;
		case "C":
			bw.write("CyKor");
			break;
		case "A":
			bw.write("AlKor");
			break;
		case "$":
			bw.write("$clear");
			break;
			default:
		}

		bw.close();
		br.close();
	}
}