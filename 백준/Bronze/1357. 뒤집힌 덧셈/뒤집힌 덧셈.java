
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int n;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String v[];
		v = br.readLine().split(" ");
		int a[]=new int[2];

		StringBuilder sb= new StringBuilder();
		for(int i=0;i<v.length;i++) {
			sb.setLength(0);
			sb = sb.append(v[i]).reverse();
			a[i] = Integer.parseInt(sb.toString());
//			System.out.println(a[i]);
		}
		sb.setLength(0);
		sb.append(a[0]+a[1]).reverse();
		bw.write(Integer.parseInt(sb.toString())+"");
		br.close();
		bw.close();
	}
}