
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	static int n, k;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while(sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}
		
		String v[] = sb.toString().split(",");
		
		long count = 0;
		for(int i=0;i<v.length;i++) {
			count += Long.parseLong(v[i]);
		}
		bw.write(count+"");
		
		sc.close();
		br.close();
		bw.close();
	}
}